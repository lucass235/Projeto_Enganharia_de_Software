import React from 'react';
import './App.css';
import { Home } from "./pages/Home/Home";
import { CoordinatorProfile } from "./pages/CoordinatorProfile/CoordinatorProfile";
import { Login } from "./pages/Login/Login";
import { List } from "./pages/List/List";
import { ForgotPassword } from "./pages/ForgotPassword/ForgotPassword";
import { EditPage } from "./pages/EditPage/EditPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";


function App() {
  return (
    <BrowserRouter>
      <Routes>
      <Route path="/" element={<Home />} />
        <Route path="/home" element={<Home />} />
        <Route path="/coordinatorprofile" element={<CoordinatorProfile />} />
        <Route path="/list" element={<List />} />
        <Route path="/login" element={<Login />} />
        <Route path="/forgotpassword" element={<ForgotPassword />} />
        <Route path="/editpage" element={<EditPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
