import React, { useRef, useEffect, useState } from "react";
import { Form } from "@unform/web";
import "./login.css";
import { Footer } from "../../components/Footer/Footer";
import { Input } from "../../components/Form/Input";
import { SubmitHandler, FormHandles } from "@unform/core";

interface FormData {
  name: string;
  email: string;
}

export function LoginPage() {
  const formRef = useRef<FormHandles>(null);
  const handleSubmit: SubmitHandler<FormData> = (data) => {
    console.log(formRef.current?.getData());
  };

  // API
  useEffect(() => {
    setTimeout(() => {
      formRef.current?.setData({
        email: "leuson.mario@unicap.br",
        password: "123456"
      })
    }, 2000);
  }, []);
  return (
    <div className="container">
      <div className="login-container">
        <div className="login-container-header">
          <h1>Login</h1>
        </div>
        <div className="login-body">
          <span className="login-body-text">Form. de login</span>
          <Form ref={formRef} onSubmit={handleSubmit} className="login-form">
            <Input className="form-field" name="email" placeholder="email" />
            <Input
              className="form-field"
              name="password"
              type="password"
              placeholder="senha"
            />
            <button type="submit" className="login-button">
              Entrar
            </button>
          </Form>
        </div>
      </div>
      <Footer />
    </div>
  );
}
