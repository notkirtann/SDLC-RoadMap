# Currency Convertor 
A simple currency converter application built with React. This application allows users to convert amounts between different currencies using real-time exchange rates.
## Features
- Convert amounts between various currencies.
- Fetch real-time exchange rates from a public API.
- User-friendly interface with input fields and dropdowns for currency selection.
- Used Custom Hooks for managing state and side effects.
## Technologies Used
- React
- JavaScript
- CSS
- Fetch API
## Getting Started
To run this project locally, follow these steps:    
1. Clone the repository:
   ```bash
   git clone
   ```
2. Navigate to the project directory:
   ```bash
   cd 05-currency-Converter
   ```
3. Install the dependencies:
   ```bash
   npm install
   ```
4. Start the development server:
   ```bash
   npm start
   ```
5. Open your browser and go to `http://localhost:3000` to see the application in action.
## Usage
1. Enter the amount you want to convert in the input field.
2. Select the source currency from the first dropdown.
3. Select the target currency from the second dropdown.
4. Click the "Convert" button to see the converted amount.
## API Reference
let url = `https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/${currency}.json`
This application uses the Currency API to fetch real-time exchange rates.
## Contributing 
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.
## License
This project is licensed under the MIT License.