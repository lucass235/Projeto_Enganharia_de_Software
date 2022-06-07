import * as React from 'react';
import { styled } from '@mui/material/styles';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell, { tableCellClasses } from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import { FaEdit } from "react-icons/fa";
import "./studenttable.css";

const StyledTableCell = styled(TableCell)(({ theme }) => ({
  [`&.${tableCellClasses.head}`]: {
    backgroundColor: theme.palette.common.black,
    color: theme.palette.common.white,
  },
  [`&.${tableCellClasses.body}`]: {
    fontSize: 14,
  },
}));

const StyledTableRow = styled(TableRow)(({ theme }) => ({
  '&:nth-of-type(odd)': {
    backgroundColor: theme.palette.action.hover,
  },
  // hide last border
  '&:last-child td, &:last-child th': {
    border: 0,
  },
}));

function createData(
 enrollment: string,
 name: string,
 email: string,
 periodo: string,
 status: string,
 coordinator: string
) {
 return { enrollment, name, email, periodo, status, coordinator,  };
}

const rows = [
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '2', 'Não estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '3', 'Estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '5', 'Estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '10', 'Estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '1', 'Estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '5', 'Estagiando', 'Léuson Mário Pedro da Silva'),
  createData('2020109733', 'Marcos Fellipe Andrade da Silva', 'marcos.2020109733@unicap.br', '7', 'Estagiando', 'Léuson Mário Pedro da Silva'),
];

export function StudentTable() {
 return (
  <TableContainer sx={{maxWidth: 1000, mx: 55, mt: 5}} component={Paper} className="table-container">
    <Table sx={{ minWidth: 700 }} aria-label="customized table">
      <TableHead>
        <TableRow>
          <StyledTableCell >Matricula</StyledTableCell>
          <StyledTableCell align="center">Nome</StyledTableCell>
          <StyledTableCell align="center">Email</StyledTableCell>
          <StyledTableCell align="center">Periodo</StyledTableCell>
          <StyledTableCell align="center">Status</StyledTableCell>
          <StyledTableCell align="center">Coordenador</StyledTableCell>
          <StyledTableCell align="center">Editar</StyledTableCell>
        </TableRow>
      </TableHead>
      <TableBody>
        {rows.map((row) => (
          <StyledTableRow key={row.name}>
            <StyledTableCell component="th" scope="row">
              {row.enrollment}
            </StyledTableCell>
            <StyledTableCell align="center">{row.name}</StyledTableCell>
            <StyledTableCell align="center">{row.email}</StyledTableCell>
            <StyledTableCell align="center">{row.periodo}</StyledTableCell>
            <StyledTableCell align="center">{row.status}</StyledTableCell>
            <StyledTableCell align="center">{row.coordinator}</StyledTableCell>
            <StyledTableCell align="center">
             <a href='/editpage' className="edit-button-table"><FaEdit /></a>
             </StyledTableCell>
          </StyledTableRow>
        ))}
      </TableBody>
    </Table>
  </TableContainer>
);
}