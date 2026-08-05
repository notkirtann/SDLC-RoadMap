import { useState, useEffect } from 'react'
import TodoForm from './components/TodoForm'
import TodoItem from './components/TodoItem'
import { TodoProvider } from './context'

function App() {
  const [todos, setTodos] = useState([])

  const addTodo = (todo) => {
    setTodos((prev) => [{ id: Date.now(), ...todo }, ...prev])
  }

  const updateTodo = (id, todo) => {
    setTodos((prev) =>
      prev.map((prevTodo) => (prevTodo.id === id ? todo : prevTodo))
    )
  }

  const deleteTodo = (id) => {
    setTodos((prev) => prev.filter((todo) => todo.id !== id))
  }

  const toggleComplete = (id) => {
    setTodos((prev) =>
      prev.map((prevTodo) =>
        prevTodo.id === id
          ? { ...prevTodo, completed: !prevTodo.completed }
          : prevTodo
      )
    )
  }

  useEffect(() => {
    const storedTodos = JSON.parse(localStorage.getItem('todos'))
    if (storedTodos?.length) {
      setTodos(storedTodos)
    }
  }, [])

  useEffect(() => {
    localStorage.setItem('todos', JSON.stringify(todos))
  }, [todos])

  return (
    <TodoProvider
      value={{ todos, addTodo, updateTodo, deleteTodo, toggleComplete }}
    >
      <div className="min-h-screen bg-linear-to-br from-blue-800 to-slate-800 py-10 px-4 bottom-5 flex">
        <div className="mx-auto max-w-2xl rounded-2xl bg-linear-to-br from-slate-800 to-blue-800 p-6 shadow-xl">
          {/* Header */}
          <h1 className="mb-6 text-center text-3xl font-bold text-white">
            Todo Manager
          </h1>

          {/* Form */}
          <div className="mb-6">
            <TodoForm />
          </div>

          {/* Todo List */}
          {todos.length === 0 ? (
            <div className="text-center text-sm text-gray-400">
              No todos yet. Add your first task above.
            </div>
          ) : (
            <div className="flex flex-col gap-3">
              {todos.map((todo) => (
                <TodoItem key={todo.id} todo={todo} />
              ))}
            </div>
          )}
        </div>
      </div>
    </TodoProvider>
  )
}

export default App
