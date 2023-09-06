package Testeaula3107.Agenda;

public abstract class Agendamento {
    // atributos
    String data;
    String horario;
    String dataHora;
   
    // metodos 
     public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getDataHora() { 
        dataHora = data+horario; 
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    
}
