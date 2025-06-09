import { Injectable } from '@angular/core';
import {Matches} from '../models/matches.model';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class MatchesService {

 private apiUrl = 'http://localhost:8081/matches';

  constructor(private http: HttpClient) { }

  getAll(): Observable<Matches[]>{
    return this.http.get<Matches[]>(this.apiUrl);
  }

  getById(id: number): Observable<Matches>{
    return this.http.get<Matches>(`${this.apiUrl}/${id}`);
  }

  create (matches: Matches): Observable<Matches>{
    return this.http.post<Matches>(`${this.apiUrl}`, matches);
  }

  delete(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
