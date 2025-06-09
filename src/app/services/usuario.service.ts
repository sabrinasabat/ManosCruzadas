import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Usuario} from '../models/usuario.model';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private apiUrl = 'http://localhost:8081/usuarios';

  constructor(private http: HttpClient) { }

  //Buscar todos los usuarios
  getAll(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(this.apiUrl);
  }

  //Buscar usuario por ID
  getById(id: number): Observable<Usuario>{
    return this.http.get<Usuario>(`${this.apiUrl}/${id}`);
  }

  //Crear un nuevo usuario
  create(usuario: Usuario): Observable<Usuario>{
    return this.http.post<Usuario>(this.apiUrl, usuario);
  }

  //Deletar un usuario
  delete(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
