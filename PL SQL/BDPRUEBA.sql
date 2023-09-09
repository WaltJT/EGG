begin
 
  DBMS_OUTPUT.PUT_LINE('Hola mundo');
   
end;
/
 
declare
  i number(8) := 1;
begin
   
  while (i<=10)
  loop
    DBMS_OUTPUT.PUT_LINE(i);
    i := i+1;
  end loop;
 
end;
/
 
declare
  v_codigocliente clientes.codigocliente%type := &codigo;
  v_nombrecliente clientes.nombrecliente%type;
begin
 
  select nombrecliente into v_nombrecliente
  from clientes
  where codigocliente = v_codigocliente;
 
  DBMS_OUTPUT.PUT_LINE('El nombre del cliente es ' || v_nombrecliente);
 
exception
  when no_data_found then
    DBMS_OUTPUT.PUT_LINE('No existe el cliente');
 
end;
/