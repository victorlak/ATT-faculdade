/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1xml;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Victor
 */
public class XMLserviceMusica {
    public String toXML(GerenciadorMusica musicas) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(GerenciadorMusica.class);
        Marshaller marshaller = context.createMarshaller();
        
        StringWriter writer = new StringWriter();
        marshaller.marshal(musicas, writer);
        return writer.toString();
    }
    public GerenciadorMusica fromXML(String xmlString) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(GerenciadorMusica.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        StringReader reader = new StringReader(xmlString);
        return (GerenciadorMusica) unmarshaller.unmarshal(reader);
        
    }
}
