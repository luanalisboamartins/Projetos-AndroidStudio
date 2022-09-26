package com.example.apptodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apptodo.adapter.TarefaAdapter
import com.example.apptodo.databinding.FragmentListBinding
import com.example.apptodo.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)


        val listTarefas = listOf(
            Tarefa(
                "Ir ao Parque",
                "Andar de Bike",
                "Luana",
                "2022-09-01",
                false,
                "Lazer"
            ),
            Tarefa(
                "Arrumar a casa",
                "Fazer tarefas de casa",
                "Luana",
                "2022-09-26",
                true,
                "Dia a Dia"
            ),
            Tarefa(
                "Ensaio AdsaPraise",
                "Ensaiar com o coral",
                "Luana",
                "2022-09-28",
                false,
                "Lazer"
            )
        )

        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener(){
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        return binding.root
    }

}