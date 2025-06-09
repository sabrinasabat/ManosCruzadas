import {Usuario} from './usuario.model';

export interface Matches {
  idMatch: number;
  fecha_match: Date;
  status: string;
  usuario1: Usuario;
  usuario2: Usuario;
}
