package com.formation.annuaire.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.annuaire.entite.Carnet;
import com.formation.annuaire.entite.Civilite;
import com.formation.annuaire.repository.CarnetRepository;

@Service
public class CarnetService implements CarnetRepository {
    @Autowired
    private CarnetRepository carnetRepo;

    List<Carnet>             listeCarnets = new ArrayList<Carnet>(Arrays.asList(new Carnet(1, Civilite.M, "Besson", "Luc", "1959-13-18", "0000000000", "5 avenue de l'Element", "75015", "Paris"),
                    new Carnet(2, Civilite.MME, "Ullmann", "Liv", "1938-12-16", "0101010101", "1-16-5", "22", "Tokyo"),
                    new Carnet(3, Civilite.M, "Lynch", "David", "1946-01-20", "0202020202", "423 Fire Terrace", "59801", "Missoula")));

    /**
     * Affichage de tous les carnets
     * 
     * @return
     */
    public List<Carnet> getAll() {
        return listeCarnets;
    }

    /**
     * Affichage d'un carnet via l'id
     * 
     * @param id
     * @return
     */

    public Carnet getById(Integer id) {
        for (Carnet c : this.listeCarnets) {
            if (c.getId() == (id)) {
                return c;
            }
        }
        return null;
    }

    //
    //    /**
    //     * Methode delete
    //     * 
    //     * @param id
    //     */
    //    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.DELETE)
    //    public void DelById(@PathVariable Integer id) {
    //        this.listeCarnets.removeIf(carnet -> carnet.getId() == (id));
    //    }
    //
    /**
     * AJOUT D'UN CARNET
     * 
     * @param carnet
     */

    public void add(Carnet carnet) {
        carnet.setId(this.listeCarnets.size() + 1);
        this.listeCarnets.add(carnet);

    }

    //
    //    /**
    //     * METhode UPDATE
    //     * 
    //     * @param carnet
    //     * @param id
    //     * @return
    //     */
    //    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.PUT)
    //    public Carnet update(@RequestBody Carnet carnet, @PathVariable Integer id) {
    //        for (Integer i = 0; i < this.listeCarnets.size(); i++) {
    //            Carnet c = this.listeCarnets.get(i);
    //            if (c.getId() == (id)) {
    //                this.listeCarnets.set(i, carnet);
    //                break;
    //            }
    //        }
    //        return null;
    //    }
    //
    //    public void setListeCarnets(List<Carnet> listeCarnets) {
    //        this.listeCarnets = listeCarnets;
    //    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Carnet arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends Carnet> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(Integer arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean existsById(Integer arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Carnet> findAll() {
        // TODO Auto-generated method stub
        return carnetRepo.findAll();
    }

    @Override
    public Iterable<Carnet> findAllById(Iterable<Integer> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Carnet> findById(Integer arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Carnet> S save(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Carnet> Iterable<S> saveAll(Iterable<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

}
