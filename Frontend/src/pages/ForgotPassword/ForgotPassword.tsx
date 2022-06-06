import { Formik, Form, Field, ErrorMessage } from "formik";
import * as yup from "yup";
import Modal from "react-modal";
import { useState } from "react";
import { Footer } from "../../components/Footer/Footer";
import "./forgotpassword.css";
import { FaTimes, FaCheck } from "react-icons/fa";

Modal.setAppElement("#root");

export function ForgotPassword() {
  const [modalIsOpen, setIsOpen] = useState(false);

  function handleOpenModal() {
    setIsOpen(true);
  }

  function handleCloseModal() {
    setIsOpen(false);
  }

  const customStyles = {
    content: {
      top: "50%",
      left: "50%",
      right: "auto",
      bottom: "auto",
      marginRight: "-50%",
      transform: "translate(-50%, -50%)",
      backgroundColor: "#ebebeb",
      borderRadius: "10px",
      padding: "10px",
      width: "18rem",
      height: "18rem",
      color: "#000",
    },
  };

  const handleClickRegister = (values: any) => console.log(values);

  const validationRegister = yup.object().shape({
    email: yup.string().email("Email inválido").required("Campo obrigatório"),
    password: yup
      .string()
      .min(6, "Senha deve ter no mínimo 6 caracteres")
      .required("Campo obrigatório"),
    confirmPassword: yup
      .string()
      .oneOf([yup.ref("password"), null], "Senhas não conferem"),
    completeName: yup.string().required("Campo obrigatório"),
    enrollment: yup
      .string()
      .min(10, "Matrícula inválida")
      .max(10, "Matrícula inválida"),
  });

  return (
    <div className="container">
      <div className="login-header-text">
        <h1>Recuperar senha</h1>
      </div>
      <div className="form-container">
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
              <p>Nova senha</p>
              <Field
                name="password"
                type="password"
                className="form-field"
                placeHolder="Senha"
              />

              <ErrorMessage
                component="span"
                name="password"
                className="form-error"
              />
            </div>

            <div className="register-form-group">
              <p>Confirmar senha</p>
              <Field
                name="confirmPassword"
                type="password"
                className="form-field"
                placeHolder="Confime sua senha"
              />

              <ErrorMessage
                component="span"
                name="confirmPassword"
                className="form-error"
              />
            </div>
          </Form>
        </Formik>
        <button className="register-button" onClick={handleOpenModal}>
          Trocar senha
        </button>
        <Modal
          isOpen={modalIsOpen}
          onRequestClose={handleCloseModal}
          style={customStyles}
        >
          <button onClick={handleCloseModal} className="close-button">
            <FaTimes />
          </button>
          <div className="modal-text-container">
            <span className="modal-text">Senha alterada com sucesso!</span>
            <span className="modal-check">
              <FaCheck />
            </span>
          </div>
          <div className="button-back-to-home-container">
            <a href="/" className="button-back-to-home">
              Voltar para página inicial
            </a>
          </div>
        </Modal>
      </div>
      <Footer />
    </div>
  );
}
