<?php 

class Pessoa{

    private String $nome, $endereco, $cep, $cidade, $bairro, $estado;

    public function getNome() : String
    {
        return $this->nome;
    }

    public function setNome($nome)
    {
        $this->nome = $nome;
    }

    public function getEndereco() : String
    {
        return $this->endereco;
    }

    public function setEndereco($endereco)
    {
        $this->endereco = $endereco;
    }

    public function getCep() : String
    {
        return $this->cep;
    }

    public function setCep($cep)
    {
        $this->cep = $cep;
    }

    public function getCidade() : String
    {
        return $this->cidade;
    }

    public function setCidade($cidade)
    {
        $this->cidade = $cidade;
    }

    public function getBairro() : String
    {
        return $this->bairro;
    }

    public function setBairro($bairro)
    {
        $this->bairro = $bairro;
    }

    public function getEstado(): String
    {
        return $this->$estado;
    }

    public function setEstado($estado)
    {        
        $this->estado = $estado;
    }
}

?>
