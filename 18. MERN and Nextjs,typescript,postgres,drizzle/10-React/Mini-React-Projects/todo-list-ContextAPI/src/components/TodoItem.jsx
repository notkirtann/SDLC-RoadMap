import React, { useState } from 'react'
import { useTodo } from '../context/TodoContext'

function TodoItem({ todo }) {
  const [isTodoEditable, setIsTodoEditable] = useState(false)
  const [todoMsg, setTodoMsg] = useState(todo.todo)
  const { updateTodo, deleteTodo, toggleComplete } = useTodo()

  const editTodo = () => {
    updateTodo(todo.id, { ...todo, todo: todoMsg })
    setIsTodoEditable(false)
  }

  return (
    <div
      className={`group flex items-center gap-3 rounded-xl border p-3 transition-all
        ${
          todo.completed
            ? 'bg-green-50 border-green-200'
            : 'bg-white border-gray-200 hover:shadow-md'
        }`}
    >
      {/* Checkbox */}
      <input
        type="checkbox"
        checked={todo.completed}
        onChange={() => toggleComplete(todo.id)}
        className="h-4 w-4 cursor-pointer accent-green-600"
      />

      {/* Todo Text */}
      <input
        type="text"
        value={todoMsg}
        readOnly={!isTodoEditable}
        onChange={(e) => setTodoMsg(e.target.value)}
        className={`flex-1 bg-transparent text-sm outline-none transition-all
          ${
            todo.completed
              ? 'line-through text-gray-400'
              : 'text-gray-800'
          }
          ${
            isTodoEditable
              ? 'rounded-md border border-blue-300 px-2 py-1 bg-blue-50'
              : ''
          }`}
      />

      {/* Edit / Save */}
      <button
        disabled={todo.completed}
        onClick={() => {
          if (todo.completed) return
          isTodoEditable ? editTodo() : setIsTodoEditable(true)
        }}
        className="flex h-8 w-8 items-center justify-center rounded-lg border
          border-gray-200 bg-gray-50 text-gray-600
          hover:bg-blue-50 hover:text-blue-600
          disabled:opacity-40 disabled:hover:bg-gray-50"
        title={isTodoEditable ? 'Save' : 'Edit'}
      >
        {isTodoEditable ? '✔' : '✏️'}
      </button>

      {/* Delete */}
      <button
        onClick={() => deleteTodo(todo.id)}
        className="flex h-8 w-8 items-center justify-center rounded-lg border
          border-gray-200 bg-gray-50 text-gray-500
          hover:bg-red-50 hover:text-red-600"
        title="Delete"
      >
        🗑
      </button>
    </div>
  )
}

export default TodoItem
