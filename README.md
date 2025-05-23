# Bloggera

Bloggera is a full-stack blog application designed to provide a seamless blogging experience. It consists of a **frontend** built with modern web technologies and a **backend** powered by Java for robust server-side functionality.

---

## Features

- **Frontend**:
  - **Built with React and Vite**: Utilizes React for building reusable UI components and Vite as the build tool for lightning-fast development and hot module replacement (HMR), making development smooth and efficient.
  - **Routing with React Router**: Implements dynamic client-side routing using `react-router-dom` for navigating between pages like Home, Login, Register, Profile, and individual Blog Posts.
  - **State Management**: Uses  Redux  to manage global state, including user authentication, blog post data, and notifications.
  - **Responsive Design**: Fully mobile-friendly and responsive across devices using Tailwind CSS flexbox/grid layouts and media queries, ensuring a consistent experience on desktops, tablets, and smartphones.
  - **Firebase Integration**: Integrated with Firebase Cloud Messaging (FCM) to support push notifications that alert users in real-time about new blog posts, likes, or comments.
  - **Authentication UI**: Includes clean and modern UI for login and registration, with form validation and error handling.
  - **API Integration**: Fetches and posts data to the backend using Fetch API or Axios, interacting with secured RESTful endpoints.
  - **Modern Styling**: Styled using modular and scalable CSS architecture using Tailwind CSS.
  - **Environment Configuration**: Uses `.env` files to securely handle API base URLs and Firebase credentials.


## 🛠️ Backend Features

- Developed using **Java** and **Spring Boot** for building scalable and maintainable APIs
- Provides **RESTful APIs** to handle:
  - Blog post creation, reading, updating, and deletion (CRUD)
  - User registration, login, and profile management
  - Commenting system linked to blog posts and users
- Implements **JWT-based authentication and authorization**:
  - Secure access to protected endpoints
  - Token generation, validation, and expiration handling
  - **Role-based access control** (Admin/User)
- Integrated with **MongoDB** as the NoSQL database for flexible and schema-less data storage
  - Collections for `users`, `posts`, `comments`, and `roles`
  - Easy document mapping using **Spring Data MongoDB**
- **BCrypt password hashing** for secure credential storage
- Global **exception handling** and meaningful API error responses
- **Input validation** using Spring’s built-in validation annotations
- **Cross-Origin Resource Sharing (CORS)** enabled for frontend-backend communication
- Follows clean, layered architecture:
  - **Controller-Service-Repository** pattern
  - **DTOs and Model Mapping** for API input/output separation
- Configured via `application.properties`:
  - MongoDB URI
  - JWT secret and expiration settings
  - Server port and custom settings
- Organized to support easy scalability and future enhancements


---

## Project Structure

### Frontend

Located in the `frontend/` directory, the frontend is a React-based single-page application (SPA). Key files and directories include:

### 📁 Frontend Project Structure

- `src/`: Contains the main application source code
  - `assets/`: Static files like images, logos, and icons
  - `components/`: Reusable UI components such as Navbar, Footer, PostCard, etc.
  - `css/`: Global and component-specific styling files (can include `.css`, `.scss`, etc.)
  - `pages/`: React components representing full pages like Home, Explore, LandingPage, UserProfile,        Notification, etc.
  - `redux/`: Redux setup including slices/reducers, actions, and store configuration
  - `services/`: Contains API service files to handle communication with backend .
  - `App.jsx`: The root component that defines routes and layout structure
  - `main.jsx`: The entry point that renders the React app into the DOM
- `public/`: Publicly accessible static files such as `index.html`, `favicon.ico`, and service worker files
- `vite.config.js`: Vite configuration file used to define build and development settings


### Backend

Located in the `backend/` directory, the backend is a Java-based application. Key files and directories include:

### 🗂️ Backend Project Structure

- `src/main/java/com/`: Contains the main Java source code organized by feature and responsibility
  - `authService/`: Handles JWT generation, validation, and authentication logic
  - `config/`: Contains configuration classes such as CORS, security, AWS, Firebase and MongoDB settings
  - `controller/`: REST controllers that define API endpoints for application.
  - `dto/`: Data Transfer Objects used to receive and send data via the API without exposing internal entities
  - `exception/`: Custom exception classes and global exception handler for managing API errors
  - `model/`: MongoDB entity classes (annotated with `@Document`) representing collections;
  - `repository/`: Interfaces extending `MongoRepository` to interact with MongoDB
  - `service/`: Contains service layer implementations for business logic
  - `serviceInterface/`: Interfaces for defining service contracts ;
  - `utility/`: Utility/helper classes such as token helpers, response formatters, etc.

- `src/main/resources/`: Application configuration files such as:
  - `application.properties`: Stores environment-specific settings (MongoDB URI, JWT secret, AWS Info etc.)

- `pom.xml`: Maven build configuration file for managing dependencies, plugins, and project metadata


---

## Getting Started

### Prerequisites

- **Frontend**:
  - Node.js (v16 or higher)
  - npm 

- **Backend**:
  - Java 17 or higher
  - Maven

---

### Installation

#### Frontend

1. Navigate to the `frontend/` directory:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm run dev
   ```

#### Backend

1. Navigate to the `backend/` directory:
   ```bash
   cd backend
   ```

2. Configure the `application.properties` file with your database and JWT settings:
   ```properties
   spring.datasource.url=jdbc:mongoDB URL
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update

   jwt.secret=your_jwt_secret
   ```

3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

---



## Environment Variables

### Frontend

Create a `.env` file in the `frontend/` directory:

```env
VITE_API_URL=http://localhost:8080/api
```

### Backend

Configure database and JWT details in `application.properties`.

---

## Author

**Ashish Meena**  
Java Full Stack Developer

- GitHub: [Ashish12meena](https://github.com/Ashish12meena)
- LinkedIn: [linkedin.com/Ashish-meena](https://www.linkedin.com/in/ashish-meena-a74263237/)

---

## License

This project is not Licensed 
