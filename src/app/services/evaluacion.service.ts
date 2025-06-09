import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Evaluacion} from '../models/evaluacion.model';

@Injectable({
  providedIn: 'root'
})
export class EvaluacionService {

  private apiUrl = 'http://localhost:8081/evaluaciones';

  constructor(private http: HttpClient) { }

  //Buscar todas las evaluaciones
  getAll(): Observable<Evaluacion[]>{
    return this.http.get<Evaluacion[]>(this.apiUrl);
  }

  //Buscar por ID
  getById(id: number): Observable<Evaluacion>{
    return this.http.get<Evaluacion>(`${this.apiUrl}/${id}`);
  }

  //Crear una evaluacion
  create (evaluacion: Evaluacion): Observable<Evaluacion>{
    return this.http.post<Evaluacion>(`${this.apiUrl}`, evaluacion);
  }

  //Deletar una evaluacion
  delete(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
