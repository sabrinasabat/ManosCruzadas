import {Usuario} from './usuario.model';
import {Matches} from './matches.model';

export interface Mensaje {
  id_mensaje: number;
  mensaje: string;
  fecha_envio: Date;
  usuarioRemitente: Usuario;
  usuarioDestinatario: Usuario;
  match: Matches;
}
