# Coffee Aur React - Hitesh Choudhary  Notes
## Introduction to React
- React is a JavaScript library for building user interfaces.
- It allows developers to create large web applications that can update and render efficiently in response to data changes.
- React follows a component-based architecture, where the UI is divided into reusable components.
- It uses a virtual DOM to optimize rendering and improve performance.

### Difference between library and framework
- A library is a collection of pre-written code that developers can use to optimize tasks. It provides specific functionality and allows developers to call its functions as needed. React is an example of a library because it focuses on building user interfaces and can be integrated into various projects without enforcing a specific structure.
- A framework, on the other hand, is a more comprehensive solution that provides a foundation for building applications. It often dictates the architecture and structure of the application, providing a set of rules and guidelines for development. Frameworks typically include libraries, tools, and best practices to streamline the development process. Examples of frameworks include Angular and Vue.js.
In summary, a library offers specific functionality that can be used as needed, while a framework provides a complete structure and set of guidelines for building applications.


## Key Concepts
1. **Components**: The building blocks of a React application. They can be functional or class-based.
2. **JSX**: A syntax extension for JavaScript that allows you to write HTML-like code within JavaScript.
3. **Props**: Short for properties, props are used to pass data from parent to child components.
4. **State**: A built-in object that allows components to manage and respond to data changes.
5. **Lifecycle Methods**: Special methods in class components that allow you to hook into different stages of a component's lifecycle (e.g., mounting, updating, unmounting).
6. **Hooks**: Functions that let you use state and other React features in functional components (e.g., useState, useEffect).


## Setting Up a React Project
create-react-app is a popular tool to set up a React project quickly.
```bash 
npx create-react-app my-app
cd my-app
npm start
``` 
This will create a new React project and start a development server.
using Vite
```bash 
npm create vite@latest my-react-app -- --template react
cd my-react-app 
npm install
npm run dev
```
This will create a new React project using Vite and start a development server.
why vite?
- Faster development server startup times
- Improved build performance
- Enhanced support for modern JavaScript features
- Built-in support for TypeScript and JSX
- Simpler configuration compared to traditional bundlers like Webpack

### Difference between Vite and Create React App
- Vite is a modern build tool that leverages native ES modules and provides faster development experiences, while Create React App is a more traditional setup that uses Webpack under the hood.
- Vite offers instant server start and lightning-fast hot module replacement (HMR), whereas Create React App may have slower startup times and HMR performance.

## Creating a Simple Component
```jsx
import React from 'react';
function HelloWorld() {
  return <h1>Hello, World!</h1>;
}
export default HelloWorld;
```
This is a simple functional component that renders "Hello, World!" to the screen.
## Rendering Components
```jsx
import React from 'react';
import ReactDOM from 'react-dom';
import HelloWorld from './HelloWorld';
ReactDOM.render(<HelloWorld />, document.getElementById('root'));
```
This code renders the `HelloWorld` component into the DOM element with the ID of `root`.
## Conclusion
React is a powerful library for building user interfaces with a component-based approach. By understanding its key concepts and setting up a project, you can start building dynamic web applications efficiently.

- Notes :
**Custom React** can be created using babel and webpack but its a lengthy process so we use CRA or Vite to create react apps easily.
**ReactDOM.render** is used in React 17 and below versions to render components to the DOM. In React 18 and above, we use **createRoot** from 'react-dom/client' to create a root and then call the render method on that root.

### Why do you need react hooks?
- Hooks allow you to use state and other React features without writing a class.
- They enable you to reuse stateful logic across components.
- Hooks simplify the code and make it easier to read and maintain.

### basic example ui update using useState hook
using normal js for ui update will  not work in react as react uses virtual dom to update the ui.
eg:
```jsx
import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  let counter = 5
  
  const addValue = ()=>{
    counter = counter +1;
    console.log(counter)
    
  }
  return (
    <>
      <h1>First counter project</h1>
      <h2>Counter value {counter}</h2>

      <button onClick={addValue}>Add Value</button>
      <br />
      <button>Remove Value</button>
    </>
  )
}

export default App
```
In the above example, clicking the "Add Value" button will not update the displayed counter value because React does not track changes to the `counter` variable. To make the UI update correctly, we need to use the `useState` hook to manage the counter state.
Corrected example using useState:
```jsx
import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  // let count = 5
  
  const addValue = ()=>{
    setCount(count+1)
  }

  const removeVal = ()=>{
    setCount(count-1)
  }

  const resetVal = ()=>{
    setCount(0)
  }
  return (
    <>
      <h1>First counter project</h1>
      <h2>Counter value {count}</h2>

      <button onClick={addValue}>Add Value</button>
      <br />
      <button onClick={removeVal}>Remove Value</button>
      <br />
      <button onClick={resetVal}>Reset Value</button>
    </>
  )
}

export default App
```
In this corrected example, we use the `useState` hook to create a state variable `count` and a function `setCount` to update it. When the buttons are clicked, the state is updated using `setCount`, which triggers a re-render of the component and updates the displayed counter value accordingly.

## Virtual DOM
- The Virtual DOM is a lightweight representation of the actual DOM.
- React uses the Virtual DOM to optimize rendering and improve performance.
- When the state of a component changes, React creates a new Virtual DOM tree and compares it with the previous one using a process called reconciliation.
- React then calculates the minimum number of changes needed to update the actual DOM and applies those changes efficiently.
### Benefits of Virtual DOM
1. **Performance**: By minimizing direct manipulations of the actual DOM, which can be slow, the Virtual DOM improves the performance of web applications.
2. **Efficiency**: The reconciliation process ensures that only the necessary changes are made to the actual DOM, reducing unnecessary updates and improving efficiency.
3. **Simplicity**: Developers can write code as if the entire UI is rendered on each change, while React handles the complex process of updating the actual DOM behind the scenes.

### React Fiber
- React Fiber is the reconciliation algorithm used by React to manage updates to the Virtual DOM.
- It allows React to break down rendering work into smaller units, enabling it to prioritize updates and improve responsiveness.
- Fiber enables features like time-slicing and concurrent rendering, allowing React to handle complex updates more efficiently.
### Benefits of React Fiber
1. **Improved Responsiveness**: Fiber allows React to prioritize updates, ensuring that high-priority updates (like user interactions) are handled quickly, improving the overall responsiveness of the application.
2. **Time-Slicing**: Fiber enables React to break down rendering work into smaller chunks, allowing it to yield control back to the main thread and avoid blocking the UI during long rendering tasks.
3. **Concurrent Rendering**: Fiber supports concurrent rendering, allowing React to work on multiple tasks simultaneously, improving the performance of complex applications.

## Hooks in Detail
### useState
- The `useState` hook allows you to add state to functional components.
- It returns an array with two elements: the current state value and a function to update it.
```jsx
const [state, setState] = useState(initialValue);
```
### useEffect
- The `useEffect` hook allows you to perform side effects in functional components.
- It takes a function as an argument that will be executed after the component renders.
```jsx
useEffect(() => {
  // Side effect code here
}, [dependencies]);
```
### useRef
- The `useRef` hook allows you to create a mutable reference that persists across renders.
- It can be used to access DOM elements or store mutable values.
```jsx
const ref = useRef(initialValue);
```
### useCallback
- The `useCallback` hook returns a memoized version of a callback function that only changes if one of the dependencies has changed.
```jsx
const memoizedCallback = useCallback(() => {
  // Callback code here
}, [dependencies]);
```
- notes rembember keys in loops/map functions should be unique and stable.

### useId
- The `useId` hook generates a unique ID that can be used for accessibility attributes or other purposes.
```jsx
const id = useId();
```

# Routes in React
refer routes-example-project for more info. in Learning folder.
## Introduction to React Router
- React Router is a popular library for handling routing in React applications.
- It allows you to define different routes and map them to specific components.
- You can use the `BrowserRouter`, `Route`, and `Link` components from React Router to set up routing in your application.

```jsx
import {Link,NavLink,Route,Routes} from 'react-router-dom'
```
- `Link` is used to create navigation links between different routes. We dont use anchor tags in react for navigation as it reloads the entire app.
- `NavLink` is similar to `Link`, but it allows you to apply active styles to the currently active link.
- `Route` is used to define a specific route and map it to a component.
-`Routes` is a container component that holds multiple `Route` components and renders the appropriate component based on the current URL.
### Example of Routing
 refer routes-example-project folder for example code.

extra router info:
- Use `useParams` hook to access route parameters. refer example in routes-example-project
- UseLoaderData to load data before rendering a route. refer example in routes-example-project.
