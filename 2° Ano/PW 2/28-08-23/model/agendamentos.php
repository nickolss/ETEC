<?php
class Agendamentos
{
    private $nome;
    private $telefone;
    private $origem;
    private $dataContato;
    private $observacao;

    // Getters e Setters

    public function setNome($nome)
    {
        $this->nome = $nome;
    }

    public function getNome()
    {
        return $this->nome;
    }

    public function setTelefone($telefone)
    {
        $this->telefone = $telefone;
    }

    public function getTelefone()
    {
        return $this->telefone;
    }

    public function setOrigem($origem)
    {
        $this->origem = $origem;
    }

    public function getOrigem()
    {
        return $this->origem;
    }

    public function setDataContato($dataContato)
    {
        $this->dataContato = $dataContato;
    }

    public function getDataContato()
    {
        return $this->dataContato;
    }

    public function setObservacao($observacao)
    {
        $this->observacao = $observacao;
    }

    public function getObservacao()
    {
        return $this->observacao;
    }
}
