package desafios

import desafios.GeradordeId.Companion.geradordeId
import javax.xml.crypto.Data


data class Tasks(
    val id: Int = 10,
    val title: String = "Teste",
    val description: String? = "Teste",
    val isCompleted: Boolean = true,
    val dateCreatedAt: String = "2021-10-04",
)

open  class  GeradordeId () {
    companion object {

        fun geradordeId(): Int {
            var id = 0
            id = (1000..9999).random()
            return id
        }
}}

fun main() {
    val listOffTasks = mutableListOf<Tasks>()
    println("Olá esse é o seu gerenciador de tarefas")
    println("O que você deseja fazer?")
    println("Digite 1 para adicionar uma nova tarefa; 2 para excluir uma tarefa, 3 para atualizar uma tarefa, 4 para visualizar todas as tarefas ")
    var operacao: String = readln().toString()

    if( operacao == "1"){

        fun addTaslks(){
            println("Digite o titulo da tarefa")
            var title: String = readln().toString()
            var id = geradordeId().hashCode()
            println("Faça uma breve descrição da tarefa")
            var description: String? = readln().toString()
            println("Qual o status da tarefa ? Digite 'true' para completa e 'false' para incompleto")
            var status: Boolean = readln().toString().toBoolean()
            println("Digite a data de criação da tarefa")
            var data: String = readln().toString()

            // Adicionar tarefas
            listOffTasks.add(Tasks( id, title, description, status,data ))
            println(listOffTasks)
        }

        addTaslks()
    } else if (operacao == "2") {

        fun deletTask (){
            listOffTasks.add(Tasks( 5, "Teste", "teste", false,"25/05/2025" ))
            listOffTasks.add(Tasks( 6, "Teste2", "teste2", false,"25/05/2025" ))
            println("Qual destas tarefas você deseja deletar ?")
            println(listOffTasks)
            println("Digite o ID da tarefa")
            var id: Int = readln().toString().toInt()
            listOffTasks.removeAll({ it.id == id })
            println(listOffTasks)
        }

        deletTask()

    } else if (operacao == "3") {

        fun updateTask(){
            listOffTasks.add(Tasks( 5, "Teste", "teste", false,"25/05/2025" ))
            listOffTasks.add(Tasks( 6, "Teste2", "teste2", false,"25/05/2025" ))
            println("Qual destas tarefas você deseja atualizar ?")
            println(listOffTasks)
            println("Digite o ID da tarefa")
            var iddigitado : Int = readln().toString().toInt()
            val objeto = listOffTasks.find { it.id == iddigitado }
            println("Digite o no titulo")
            var novotitulo: String = readln().toString()
            println("Digite a nova descrição da tarefa")
            var novadescricao: String = readln().toString()
            println("Digite o status da tarefa")
            var status: Boolean = readln().toString().toBoolean()
            println("Atualize a data da tarefa")
            var data: String = readln().toString()
            listOffTasks.removeAll({ it.id == iddigitado })
            listOffTasks.add(Tasks( iddigitado, novotitulo, novadescricao, status,data ))

            println(listOffTasks)
        }

        updateTask()

    }

    else if (operacao == "4") {

        fun showAllTasks (){
            listOffTasks.add(Tasks( 5, "Teste", "teste", false,"25/05/2025" ))
            listOffTasks.add(Tasks( 6, "Teste2", "teste2", false,"25/05/2025" ))
            println(listOffTasks)
        }

        showAllTasks()

    } else {
        println("Por favor renicie o programa e digite uma opção válida!")

    }
}


