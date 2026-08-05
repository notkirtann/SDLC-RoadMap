import {createSlice,nanoid} from '@reduxjs/toolkit'

const initialState = {
    todos: [{id: '1', title: 'Learn Redux Toolkit'}]
}

export const todoSlice = createSlice({
    name: 'todo',
    initialState,
    reducers:{
        addTodo: (state, action)=>{
        const newTodo = {
            id: nanoid(),
            title: action.payload.title
        }
        state.todos.push(newTodo)        
        },
        removeTodo: (state, action)=>{
            state.todos = state.todos.filter(todo => todo.id !== action.payload.id)
        }
    }
})
export const {addTodo, removeTodo} = todoSlice.actions
export default todoSlice.reducer