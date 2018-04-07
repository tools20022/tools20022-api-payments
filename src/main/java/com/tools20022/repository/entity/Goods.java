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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.GoodsPartyRole;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Good is a physical product that can be delivered to a purchaser and that
 * involves the transfer of ownership from seller to customer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Goods" src="doc-files/Goods.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmTransport
 * Goods.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmAnalysis
 * Goods.mmAnalysis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmHealthCheck
 * Goods.mmHealthCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Goods#mmPhytosanitaryInspection
 * Goods.mmPhytosanitaryInspection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmPartyRole
 * Goods.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
 * Transport.mmTransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GoodsPartyRole#mmItem
 * GoodsPartyRole.mmItem}</li>
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
 * "Goods"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Good is a physical product that can be delivered to a purchaser and that involves the transfer of ownership from seller to customer."
 * </li>
 * </ul>
 */
public class Goods extends Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Transport transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
	 * Transport.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Goods
	 * Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport information related to the delivery of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Goods, Optional<Transport>> mmTransport = new MMBusinessAssociationEnd<Goods, Optional<Transport>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport information related to the delivery of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportedGoods;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}

		@Override
		public Optional<Transport> getValue(Goods obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(Goods obj, Optional<Transport> value) {
			obj.setTransport(value.orElse(null));
		}
	};
	protected Max70Text analysis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Goods
	 * Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Analysis of the goods, as proven by the trade certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Goods, Max70Text> mmAnalysis = new MMBusinessAttribute<Goods, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Analysis";
			definition = "Analysis of the goods, as proven by the trade certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Goods obj) {
			return obj.getAnalysis();
		}

		@Override
		public void setValue(Goods obj, Max70Text value) {
			obj.setAnalysis(value);
		}
	};
	protected YesNoIndicator healthCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Goods
	 * Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HealthCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the goods have passed the health check."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Goods, YesNoIndicator> mmHealthCheck = new MMBusinessAttribute<Goods, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HealthCheck";
			definition = "Indicates if the goods have passed the health check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Goods obj) {
			return obj.getHealthCheck();
		}

		@Override
		public void setValue(Goods obj, YesNoIndicator value) {
			obj.setHealthCheck(value);
		}
	};
	protected YesNoIndicator phytosanitaryInspection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Goods
	 * Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhytosanitaryInspection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the goods have passed the phytosanitary inspection."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Goods, YesNoIndicator> mmPhytosanitaryInspection = new MMBusinessAttribute<Goods, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhytosanitaryInspection";
			definition = "Indicates if the goods have passed the phytosanitary inspection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Goods obj) {
			return obj.getPhytosanitaryInspection();
		}

		@Override
		public void setValue(Goods obj, YesNoIndicator value) {
			obj.setPhytosanitaryInspection(value);
		}
	};
	protected List<GoodsPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GoodsPartyRole#mmItem
	 * GoodsPartyRole.mmItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.GoodsPartyRole
	 * GoodsPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Goods
	 * Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of producing goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Goods, List<GoodsPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Goods, List<GoodsPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of producing goods.";
			minOccurs = 0;
			opposite_lazy = () -> GoodsPartyRole.mmItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GoodsPartyRole.mmObject();
		}

		@Override
		public List<GoodsPartyRole> getValue(Goods obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Goods obj, List<GoodsPartyRole> value) {
			obj.setPartyRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Goods";
				definition = "Good is a physical product that can be delivered to a purchaser and that involves the transfer of ownership from seller to customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmTransportedGoods, GoodsPartyRole.mmItem);
				superType_lazy = () -> Product.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Goods.mmTransport, com.tools20022.repository.entity.Goods.mmAnalysis, com.tools20022.repository.entity.Goods.mmHealthCheck,
						com.tools20022.repository.entity.Goods.mmPhytosanitaryInspection, com.tools20022.repository.entity.Goods.mmPartyRole);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Goods.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Transport> getTransport() {
		return transport == null ? Optional.empty() : Optional.of(transport);
	}

	public Goods setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
		return this;
	}

	public Max70Text getAnalysis() {
		return analysis;
	}

	public Goods setAnalysis(Max70Text analysis) {
		this.analysis = Objects.requireNonNull(analysis);
		return this;
	}

	public YesNoIndicator getHealthCheck() {
		return healthCheck;
	}

	public Goods setHealthCheck(YesNoIndicator healthCheck) {
		this.healthCheck = Objects.requireNonNull(healthCheck);
		return this;
	}

	public YesNoIndicator getPhytosanitaryInspection() {
		return phytosanitaryInspection;
	}

	public Goods setPhytosanitaryInspection(YesNoIndicator phytosanitaryInspection) {
		this.phytosanitaryInspection = Objects.requireNonNull(phytosanitaryInspection);
		return this;
	}

	public List<GoodsPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Goods setPartyRole(List<GoodsPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}
}