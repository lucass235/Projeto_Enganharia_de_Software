import React from "react";
import { Navbar } from "../../components/Navbar/Navbar";
import { Footer } from "../../components/Footer/Footer";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as yup from "yup";
import "./editpage.css";

export function EditPage() {
  const handleClickRegister = (values: any) => console.log(values);

  const validationRegister = yup.object().shape({
    completeName: yup.string().required("Campo obrigatório"),
    enrollment: yup
      .string()
      .min(10, "Matrícula inválida")
      .max(10, "Matrícula inválida")
      .required("Campo obrigatório"),
    coordinatorName: yup.string().required("Campo obrigatório"),
    period: yup.string().required("Campo obrigatório"),
  });

  return (
    <div className="container">
      <Navbar />
      <div className="login-header-text">
        <h1>Edição</h1>
      </div>
      <div className="container-edit-form">
        <Formik
          initialValues={{}}
          onSubmit={handleClickRegister}
          validationSchema={validationRegister}
          className="form"
        >
          <Form className="edit-form">
            <div className="register-form-group">
              <p>Nome</p>
              <Field
                name="completeName"
                className="form-field"
                placeHolder="Nome completo"
              />

              <ErrorMessage
                component="span"
                name="completeName"
                className="form-error"
              />
            </div>

            <div className="edit-form-group">
              <p>Matrícula</p>
              <Field
                name="enrollment"
                className="form-field"
                placeHolder="Matrícula (apenas números)"
              />

              <ErrorMessage
                component="span"
                name="enrollment"
                className="form-error"
              />
            </div>

            <div className="edit-form-group">
              <p>Coordenador</p>
              <Field
                name="coordinatorName"
                className="form-field"
                placeHolder="Nome completo do coordenador"
              />

              <ErrorMessage
                component="span"
                name="coordinatorName"
                className="form-error"
              />
            </div>

            <div className="edit-form-group">
              <p>Período</p>
              <Field
                name="period"
                className="form-field"
                placeHolder="Apenas números"
              />

              <ErrorMessage
                component="span"
                name="period"
                className="form-error"
              />
            </div>

            <div className="working-buttons">
              <button className="working-button" type="submit">
                Estagiando
              </button>
              <button className="working-button" type="submit">
                Não estagiando
              </button>
            </div>
          </Form>
        </Formik>
        <button className="register-button" type="submit">
          Editar usuário
        </button>
      </div>
      <Footer />
    </div>
  );
}
