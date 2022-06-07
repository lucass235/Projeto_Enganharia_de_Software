import React from "react";
import { Navbar } from "../../components/Navbar/Navbar";
import { Footer } from "../../components/Footer/Footer";
import { StudentTable } from "../../components/StudantTable/StudentTable";
import { FaPlus, FaTimes } from "react-icons/fa";
import { RegisterForm } from "../../components/RegisterForm/RegisterForm";
import Modal from 'react-modal';
import { useState } from "react";
import "./list.css";

export function List() {
  const [modalIsOpen, setIsOpen] = useState(false);

  function handleOpenModal() {
   setIsOpen(true);
  }
 
  function handleCloseModal() {
   setIsOpen(false);
  }

  const customStyles = {
    content: {
     top: '50%',
     left: '50%',
     right: 'auto',
     bottom: 'auto',
     marginRight: '-50%',
     transform: 'translate(-50%, -50%)',
     backgroundColor: '#ebebeb',
     borderRadius: '10px',
     padding: '10px',
     width: '20rem',
     height: '35rem',
     color: '#000',
    }
   }

  return (
    <div className="container">
      <Navbar />
      <div className="list-container">
        <div className="list-header-text">
          <h1>Lista de alunos</h1>
        </div>
        <div className="list-body">
          <StudentTable />
        </div>
        <div className="add-button-container">
          <button className="add-button" onClick={handleOpenModal}><FaPlus /></button>
        </div>
        <Modal
          isOpen={modalIsOpen}
          onRequestClose={handleCloseModal}
          style={customStyles}
          >
           <button onClick={handleCloseModal} className="close-button"><FaTimes /></button>
           <div className="student-register-form">
             <RegisterForm />
           </div>
         </Modal>
      </div>
      <Footer />
    </div>
  );
}
