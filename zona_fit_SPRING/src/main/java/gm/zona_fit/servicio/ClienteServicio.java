package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.IClienteRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{

    @Autowired
    private IClienteRespositorio clienteRespositorio;
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRespositorio.findAll();
        return  clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idcliente) {
        Cliente cliente = clienteRespositorio.findById(idcliente).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRespositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRespositorio.delete(cliente);
    }
}
