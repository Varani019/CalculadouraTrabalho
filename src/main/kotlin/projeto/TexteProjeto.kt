package projeto


// fazer um proeto que some o dia de trabalho nemos o gasto
//depois soma o resuda dos dias e ver o resutado da semana


fun main(){
     val Segunda = SomaDosDias(
          Renda = 50 ,
          Gasto = 10 )
     val ResultadoSegunda = Segunda.Renda - Segunda.Gasto


     println("renda = ${Segunda.Renda}  \ngasto = ${Segunda.Gasto}  \nresultado = $ResultadoSegunda")

     println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,")

     val treça = SomaDosDias(
          Renda = 30,
          Gasto = 5)
     val resulatadoterça = treça.Renda - treça.Gasto

     println("renda = ${treça.Renda}  \ngasto = ${treça.Gasto}  \nresultado = $resulatadoterça")

     println(",,,,,,,,,,,,,,,,,,,,,,")

     val semana = ResultadoSegunda + resulatadoterça

     println("soma da semana = $semana")

}
