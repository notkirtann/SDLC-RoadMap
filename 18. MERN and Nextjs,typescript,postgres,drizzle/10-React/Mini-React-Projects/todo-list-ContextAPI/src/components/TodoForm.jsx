import React, { useState } from 'react'
import { useTodo } from '../context/TodoContext'

function TodoForm() {
  const [todo, setTodo] = useState('')
  const { addTodo } = useTodo()

  const add = (e) => {
    e.preventDefault()
    if (!todo.trim()) return
    addTodo({ todo, completed: false })
    setTodo('')
  }

  return (
    <form
      onSubmit={add}
      className="flex items-center gap-2 rounded-xl border border-gray-200 bg-white p-2 shadow-sm"
    >
      <input
        type="text"
        placeholder="Add a new task..."
        value={todo}
        onChange={(e) => setTodo(e.target.value)}
        className="flex-1 bg-transparent px-3 py-2 text-sm text-gray-800
          outline-none placeholder:text-gray-400"
      />

      <button
        type="submit"
        disabled={!todo.trim()}
        className="rounded-lg bg-green-600 px-4 py-2 text-sm font-medium
          text-white transition-all
          hover:bg-green-700 active:scale-95
          disabled:bg-green-300 disabled:cursor-not-allowed"
      >
        Add
      </button>
    </form>
  )
}

export default TodoForm
