//Aquí defino la estructura que voy a recibir del backend

export interface Usuario {

  idUsuario: number;
  nombre: string;
  email: string;
  password: string;
  ubicacion: string;
  foto_perfil: string;
}
