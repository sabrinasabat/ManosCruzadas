import { Usuario } from './usuario.model';

export interface Evaluacion {

  id_evaluacion: number;
  nota: number;
  comentario: string;
  fecha_evaluacion: Date;
  evaluador: Usuario;
  evaluado: Usuario;
}
