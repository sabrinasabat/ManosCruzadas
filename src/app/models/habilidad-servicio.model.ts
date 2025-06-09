import { Usuario} from './usuario.model';
import { Subcategoria} from './subcategoria.model';

//Aquí yo defino la estructura de los datos que voy a recibir del backend


export interface HabilidadServicio {

  //ID de la habilidad o servicio
  id_habilidad: number;

  //Nombre de la habilidad o servicio
  nombre: string;

  //Descripción mas detallada de la habilidad o servicio
  descripcion: string;

  //Categoria principal
  tipo: string;

  //pillando el usuario que ha creado la habilidad o servicio
  usuario: Usuario;

  //Subcategoria a la que pertenece la habilidad o servicio
  subCategoria: Subcategoria;
}
