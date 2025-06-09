//Definiendo la estructura que voy a recibir del backend (puse interface porque no tendrá lógica de negocio)
import { Categoria } from './categoria.model';
export interface Subcategoria {

  idSubcategoria: number;
  nombre: string;
  categoria: Categoria;
}
