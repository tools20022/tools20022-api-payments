/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Scheme;
import com.tools20022.repository.entity.SectorStrategy;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Type of business of the organisation, for example, pharmaceutical.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Sector" src="doc-files/Sector.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmSecurity
 * Sector.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmScheme
 * Sector.mmScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
 * Sector.mmOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmIdentification
 * Sector.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmStrategy
 * Sector.mmStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSector
 * Security.mmSector}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmSector
 * Organisation.mmSector}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmSector
 * Scheme.mmSector}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SectorStrategy#mmSector
 * SectorStrategy.mmSector}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Sector"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of business of the organisation, for example, pharmaceutical."</li>
 * </ul>
 */
public class Sector {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSector
	 * Security.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Sector
	 * Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a sector is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Sector, Security> mmSecurity = new MMBusinessAssociationEnd<Sector, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a sector is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmSector;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Sector obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(Sector obj, Security value) {
			obj.setSecurity(value);
		}
	};
	protected Scheme scheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Scheme#mmSector
	 * Scheme.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Sector
	 * Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding the entity that assigns the sector code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Sector, Scheme> mmScheme = new MMBusinessAssociationEnd<Sector, Scheme>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding the entity that assigns the sector code.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmSector;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(Sector obj) {
			return obj.getScheme();
		}

		@Override
		public void setValue(Sector obj, Scheme value) {
			obj.setScheme(value);
		}
	};
	protected Organisation organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSector
	 * Organisation.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Sector
	 * Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which belongs to a specific sector."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Sector, Organisation> mmOrganisation = new MMBusinessAssociationEnd<Sector, Organisation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which belongs to a specific sector.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Organisation.mmSector;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}

		@Override
		public Organisation getValue(Sector obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(Sector obj, Organisation value) {
			obj.setOrganisation(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Sector
	 * Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of business of the organisation, for example, pharmaceutical."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Sector, Max35Text> mmIdentification = new MMBusinessAttribute<Sector, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Type of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Sector obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Sector obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<SectorStrategy> strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SectorStrategy#mmSector
	 * SectorStrategy.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SectorStrategy
	 * SectorStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Sector
	 * Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy based on sector."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Sector, List<SectorStrategy>> mmStrategy = new MMBusinessAssociationEnd<Sector, List<SectorStrategy>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy based on sector.";
			minOccurs = 0;
			opposite_lazy = () -> SectorStrategy.mmSector;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SectorStrategy.mmObject();
		}

		@Override
		public List<SectorStrategy> getValue(Sector obj) {
			return obj.getStrategy();
		}

		@Override
		public void setValue(Sector obj, List<SectorStrategy> value) {
			obj.setStrategy(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Sector";
				definition = "Type of business of the organisation, for example, pharmaceutical.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmSector, Organisation.mmSector, Scheme.mmSector, SectorStrategy.mmSector);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Sector.mmSecurity, com.tools20022.repository.entity.Sector.mmScheme, com.tools20022.repository.entity.Sector.mmOrganisation,
						com.tools20022.repository.entity.Sector.mmIdentification, com.tools20022.repository.entity.Sector.mmStrategy);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Sector.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Security getSecurity() {
		return security;
	}

	public Sector setSecurity(Security security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public Sector setScheme(Scheme scheme) {
		this.scheme = Objects.requireNonNull(scheme);
		return this;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public Sector setOrganisation(Organisation organisation) {
		this.organisation = Objects.requireNonNull(organisation);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Sector setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<SectorStrategy> getStrategy() {
		return strategy == null ? strategy = new ArrayList<>() : strategy;
	}

	public Sector setStrategy(List<SectorStrategy> strategy) {
		this.strategy = Objects.requireNonNull(strategy);
		return this;
	}
}