import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Subcategoria} from '../models/subcategoria.model';

@Injectable({
  providedIn: 'root'
})
export class SubcategoriaService {

  private apiUrl = 'http://localhost:8081/subcategorias';

  constructor(private http: HttpClient) { }

  //Metodo para obtener todas las subcategorías
  getAll():Observable<Subcategoria[]> {
    return this.http.get<Subcategoria[]>(this.apiUrl);
  }

  //Buscar la subcategoria por ID
  getById(id: number): Observable<Subcategoria>{
    return this.http.get<Subcategoria>(`${this.apiUrl}/${id}`);
  }

  //Buscar subcategoria por ID de la Categoria
  getByCategoria(idCategoria: number): Observable<Subcategoria[]>{
    return this.http.get<Subcategoria[]>(`${this.apiUrl}/categoria/${idCategoria}`);
  }

  //Crear una nueva categoria
  create(subCategoria: Subcategoria): Observable<Subcategoria>{
    return this.http.post<Subcategoria>(this.apiUrl, subCategoria);
  }

  //Deletar una subcategoria por ID
  delete(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
