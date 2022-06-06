import React from "react";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as yup from "yup";
import "./registerform.css";

export function RegisterForm() {
  const handleClickRegister = (values: any) => console.log(values);

  const validationRegister = yup.object().shape({
    email: yup.string().email("Email inválido").required("Campo obrigatório"),
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
      <Formik
        initialValues={{}}
        onSubmit={handleClickRegister}
        validationSchema={validationRegister}
      >
        <Form className="register-form">
          <div className="register-form-group">
            <p>Email</p>
            <Field name="email" className="form-field" placeHolder="Email" />

            <ErrorMessage
              component="span"
              name="email"
              className="form-error"
            />
          </div>

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

          <div className="register-form-group">
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

          <div className="register-form-group">
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

          <div className="register-form-group">
            <p>Período</p>
            <Field
              name="period"
              className="form-field"
              placeHolder="Matrícula (apenas números)"
            />

            <ErrorMessage
              component="span"
              name="period"
              className="form-error"
            />
          </div>
        </Form>
      </Formik>
      <button className="register-button" type="submit">Confirmar cadastro</button>
    </div>
  );
}
