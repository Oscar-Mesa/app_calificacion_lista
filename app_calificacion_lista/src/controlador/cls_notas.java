package controlador;
public class cls_notas {
        private String str_nombre;
        private String str_codigo;
        private float flt_nota1;
        private float flt_nota2;
        private float flt_seguimiento;
        private float flt_final;
        private String str_fecha;
        private String str_asignatura;
        
        public cls_notas(String nombre, String codigo, float n1, float n2, float seguimiento, String fecha, String asignatura){
            this.str_nombre = nombre;
            this.str_codigo = codigo;
            this.flt_nota1 = n1;
            this.flt_nota2 = n2;
            this.flt_seguimiento = seguimiento;
            this.str_fecha = fecha;
            this.str_asignatura = asignatura;
            this.flt_final = (float)((this.flt_nota1*0.25)+(this.flt_nota2*0.25)+(this.flt_seguimiento*0.50));
        }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public float getFlt_nota1() {
        return flt_nota1;
    }

    public void setFlt_nota1(float flt_nota1) {
        this.flt_nota1 = flt_nota1;
    }

    public float getFlt_nota2() {
        return flt_nota2;
    }

    public void setFlt_nota2(float flt_nota2) {
        this.flt_nota2 = flt_nota2;
    }

    public float getFlt_seguimiento() {
        return flt_seguimiento;
    }

    public void setFlt_seguimiento(float flt_seguimiento) {
        this.flt_seguimiento = flt_seguimiento;
    }

    public float getFlt_final() {
        return flt_final;
    }

    public void setFlt_final(float flt_final) {
        this.flt_final = flt_final;
    }

    public String getStr_fecha() {
        return str_fecha;
    }

    public void setStr_fecha(String str_fecha) {
        this.str_fecha = str_fecha;
    }

    public String getStr_asignatura() {
        return str_asignatura;
    }

    public void setStr_asignatura(String str_asignatura) {
        this.str_asignatura = str_asignatura;
    }
}
