import React from 'react'
import "./home.css";

export function Home() {
  return (
    <div className="container">
      <div className="home-container">
        <div className="home-left">
          <span className="home-left-text" id="home-left-text-top">Gerenciando o seu estágio da melhor forma</span>
          <span className="home-left-text">Começe agora mesmo!</span>
        </div>
        <div className="home-right">
          <span className="home-right-title">Estagiagil</span>
          <div className="buttons-container">
            <div className="buttons-container-login">
              <a href="/login" className="home-button" id="home-button-login">Login</a>
            </div>
            <div className="buttons-container-register">
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}