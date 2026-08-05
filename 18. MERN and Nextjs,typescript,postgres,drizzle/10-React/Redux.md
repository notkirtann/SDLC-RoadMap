# React Redux Redux-Toolkit Guide
This guide provides an overview of how to use Redux and Redux Toolkit in a React application. Redux is a state management library that helps manage the state of your application in a predictable way. Redux Toolkit is the official, recommended way to write Redux logic, providing a set of tools to simplify common tasks.
## Table of Contents
1. [Setting Up Redux in a React Application](#setting-up-redux-in-a-react-application)
2. [Creating a Redux Store](#creating-a-redux-store)    
3. [Defining Slices with Redux Toolkit](#defining-slices-with-redux-toolkit)
4. [Using Redux State in React Components](#using-redux-state-in-react-components)
5. [Dispatching Actions](#dispatching-actions)
6. [Asynchronous Actions with Thunks](#asynchronous-actions-with-thunks)
## Setting Up Redux in a React Application
To set up Redux in a React application, you need to install the necessary packages. You can do this using npm :

```bash
npm install @reduxjs/toolkit react-redux
``` 
#### Back story about props drilling and context API Flux redux and finally redux toolkit:
In a typical React application, managing state can become complex as the application grows. Props drilling, where you pass props down through multiple levels of components, can lead to cumbersome and hard-to-maintain code. The Context API helps alleviate some of these issues by providing a way to share state across components without passing props explicitly. However, for larger applications with more complex state management needs, a more robust solution is often required.
Flux is an architectural pattern that emphasizes unidirectional data flow, making it easier to manage state changes. Redux is a popular implementation of the Flux pattern, providing a predictable state container for JavaScript applications. Redux Toolkit builds on top of Redux, offering a set of tools and best practices to simplify the process of writing Redux logic.

In short redux is an independent state management library that can be used with any UI layer, while Redux Toolkit is a set of tools and abstractions built on top of Redux to make it easier to use.
redux-react is the official React binding for Redux, allowing you to connect your React components to the Redux store.

#### Difference between Redux and Redux Toolkit:
| Feature                     | Redux                                    | Redux Toolkit                          |
|-----------------------------|------------------------------------------|---------------------------------------|  
| Boilerplate Code            | Requires more boilerplate code           | Reduces boilerplate with built-in tools|
| State Management            | Manual setup of reducers and actions     | Provides createSlice for easier setup  |
| Middleware                  | Requires manual setup                    | Includes built-in middleware like thunk|
| DevTools Integration        | Requires manual setup                    | Built-in support for Redux DevTools    |
| Best Practices              | Requires manual adherence                | Encourages best practices by default   |

## Creating a Redux Store
To create a Redux store, you can use the `configureStore` function from Redux Toolkit. Here's an example of how to create a store:

```javascript
import { configureStore } from '@reduxjs/toolkit';
import rootReducer from './reducers';
const store = configureStore({
  reducer: rootReducer,
});
export default store;
```