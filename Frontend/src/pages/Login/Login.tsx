import React from "react";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as yup from "yup";
import "./login.css";
import { Footer } from "../../components/Footer/Footer";

export function Login() {
  const handleClickLogin = (values: any) => console.log(values);

  const validationLogin = yup.object().shape({
    email: yup.string().email("Email inválido").required("Campo obrigatório"),
    password: yup
      .string()
      .min(6, "Senha deve ter no mínimo 6 caracteres")
      .required("Campo obrigatório"),
  });
  return (
    <div className="container">
      <div className="login-container">
        <div className="login-header-text">
          <h1>Login</h1>
        </div>
        <div className="login-body">
          <span className="login-body-name">Formulário</span>
          <Formik
            initialValues={{}}
            onSubmit={handleClickLogin}
            validationSchema={validationLogin}
          >
            <Form className="login-form">
              <div className="login-form-group">
                <p>Email</p>
                <Field
                  name="email"
                  className="form-field"
                  placeHolder="Email"
                />

                <ErrorMessage
                  component="span"
                  name="email"
                  className="form-error"
                />
              </div>

              <div className="login-form-group">
                <p>Senha</p>
                <Field
                  name="password"
                  className="form-field"
                  type="password"
                  placeHolder="Senha"
                />

                <ErrorMessage
                  component="span"
                  name="password"
                  className="form-error"
                />
              </div>

              <a href="/list" className="login-button" type="submit">
                Login
              </a>
            </Form>
          </Formik>
        </div>
      </div>
      <Footer />
    </div>
  );
}
