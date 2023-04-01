public class meth
{
	public int multiplicar (int n1, int n2)
	{
		return n1 * n2;
	}
	
	public int somar (int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int subtrair (int n1, int n2)
	{
		return n1 - n2;
	}
	
	public int dividir (int n1, int n2) throws DivisaoPorZeroException
	{ // Inserindo o retorno da exceção em um método.
        if (n2 == 0){
            throw new DivisaoPorZeroException();
        }
		return n1 / n2;
	}
}
