package com.example.ServidorSura5.Servicios;

import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.Repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosPaciente {
    //llamar al respositorio respectivo

    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //se programa las funciones para las distintas opercaiones en bd

    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try{
            return iRepositorioPaciente.save(datosPaciente);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
