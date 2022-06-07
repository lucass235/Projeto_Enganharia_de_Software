import React from "react";
import { Footer } from "../../components/Footer/Footer";
import { Navbar } from "../../components/Navbar/Navbar";
import "./coordinatorprofile.css";

export function CoordinatorProfile() {
  const matricula = "2022109513";
  const nome = "Léuson Mário Pedro da Silva";
  const email = "leuson.silva@unicap.br";

  return (
    <div className="container">
      <Navbar />
      <div className="profile-container">
        <div className="profile-header">
          <div className="profile-header-text">
            <h1>Perfil de Léuson Mário Pedro da Silva.</h1>
          </div>
        </div>
        <div className="profile-body">
          <div className="profile-body-informations">
            <span className="profile-body-top">Informações</span>
            <span className="profile-id">Matricula: {matricula}</span>
            <span className="profile-name">Nome: {nome}</span>
            <span className="profile-email">Email: {email}</span>
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
}
