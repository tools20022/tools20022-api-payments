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
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Specifies the transport information related to the delivery of goods.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
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
	};
	protected Max70Text analysis;
	/**
	 * Analysis of the goods, as proven by the trade certificate.
	 * <p>
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
	public static final MMBusinessAttribute mmAnalysis = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Goods.class.getMethod("getAnalysis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator healthCheck;
	/**
	 * Indicates if the goods have passed the health check.
	 * <p>
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
	public static final MMBusinessAttribute mmHealthCheck = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Goods.class.getMethod("getHealthCheck", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator phytosanitaryInspection;
	/**
	 * Indicates if the goods have passed the phytosanitary inspection.
	 * <p>
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
	public static final MMBusinessAttribute mmPhytosanitaryInspection = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Goods.class.getMethod("getPhytosanitaryInspection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.GoodsPartyRole> partyRole;
	/**
	 * Role played by a party in the context of producing goods.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of producing goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GoodsPartyRole.mmItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GoodsPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Goods";
				definition = "Good is a physical product that can be delivered to a purchaser and that involves the transfer of ownership from seller to customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmTransportedGoods, com.tools20022.repository.entity.GoodsPartyRole.mmItem);
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

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
	}

	public Max70Text getAnalysis() {
		return analysis;
	}

	public void setAnalysis(Max70Text analysis) {
		this.analysis = analysis;
	}

	public YesNoIndicator getHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(YesNoIndicator healthCheck) {
		this.healthCheck = healthCheck;
	}

	public YesNoIndicator getPhytosanitaryInspection() {
		return phytosanitaryInspection;
	}

	public void setPhytosanitaryInspection(YesNoIndicator phytosanitaryInspection) {
		this.phytosanitaryInspection = phytosanitaryInspection;
	}

	public List<GoodsPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.GoodsPartyRole> partyRole) {
		this.partyRole = partyRole;
	}
}