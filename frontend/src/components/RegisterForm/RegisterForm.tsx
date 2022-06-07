import React, { useRef, useEffect } from "react";
import { Form } from "@unform/web";
import "./registerform.css";
import { Input } from "../../components/Form/Input";
import { SubmitHandler, FormHandles } from "@unform/core";

interface FormData {
  name: string;
  email: string;
}
export function RegisterForm() {
  const formRef = useRef<FormHandles>(null);
  const handleSubmit: SubmitHandler<FormData> = (data) => {
    console.log(formRef.current?.getData());
  };

  // API
  useEffect(() => {
    setTimeout(() => {
      formRef.current?.setData({
        enrollment: "2020109733",
        name: "Marcos Fellipe Andrade da Silva",
        email: "marcos.2020109733@unicap.br",
        period: "2",
        coordinator: "Leuson Mario",
      });
    }, 2000);
  }, []);
  return (
    <div className="container">
      <div className="register-container">
        <div className="register-container-header">
          <h1>Cadastro</h1>
        </div>
        <div className="register-body">
          <span className="register-body-text">Form. de cadastro</span>
          <Form ref={formRef} onSubmit={handleSubmit} className="register-form">
            <Input
              className="form-field"
              name="enrollment"
              placeholder="Matricula"
            />
            <Input
              className="form-field"
              name="name"
              placeholder="Nome completo"
            />
            <Input className="form-field" name="email" placeholder="Email" />
            <Input className="form-field" name="period" placeholder="Período" />
            <Input
              className="form-field"
              name="coordinator"
              placeholder="Nome do coordenador"
            />

            <button type="submit" className="register-button">
              Cadastrar
            </button>
          </Form>
        </div>
      </div>
    </div>
  );
}
