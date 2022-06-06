import "./navbar.css";
import { CgProfile, CgLogOut } from "react-icons/cg";

export function Navbar() {
  return (
    <div className="container">
      <div className="navbar">
        <div className="logo">
          <h1>Estagiagil</h1>
        </div>
        <div className="navbar-buttons">
          <div className="navbar-button">
            <a href="/list" className="jobs-button">Lista</a>
          </div>
        </div>
        <div className="navbar-options">
          <div className="profile-option">
            <div className="profile-button">
              <a href="/coordinatorprofile" className="student-profile-button"><CgProfile/></a>
            </div>
          </div>
          <div className="logout-option">
            <div className="logout-button-container">
              <a href="/" className="logout-button"><CgLogOut/></a>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};