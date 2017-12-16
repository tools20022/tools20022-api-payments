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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Reference number assigned by the clearing broker. A distinction can be made
 * between the reference for the Central Counterparty (CCP) leg and the
 * reference for the client leg of the transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingBrokerIdentification"
 * src="doc-files/ClearingBrokerIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmSideIndicator
 * ClearingBrokerIdentification.mmSideIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmIdentification
 * ClearingBrokerIdentification.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
 * TradeIdentification.mmClearingBrokerIdentification}</li>
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
 * "ClearingBrokerIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction."
 * </li>
 * </ul>
 */
public class ClearingBrokerIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.TradeIdentification> relatedTradeIdentification;
	/**
	 * Other identifications of a trade for which clearing broker
	 * identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
	 * TradeIdentification.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other identifications of a trade for which clearing broker identifications are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTradeIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTradeIdentification";
			definition = "Other identifications of a trade for which clearing broker identifications are provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
		}
	};
	protected Max35Text sideIndicator;
	/**
	 * Distinguishes the client leg from the central counterpatry (CCP) leg in
	 * the clearing broker identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distinguishes the client leg from the central counterpatry (CCP) leg in the clearing broker identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSideIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SideIndicator";
			definition = "Distinguishes the client leg from the central counterpatry (CCP) leg in the clearing broker identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClearingBrokerIdentification.class.getMethod("getSideIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Identification assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the clearing broker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClearingBrokerIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingBrokerIdentification";
				definition = "Reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification, com.tools20022.repository.entity.ClearingBrokerIdentification.mmSideIndicator,
						com.tools20022.repository.entity.ClearingBrokerIdentification.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClearingBrokerIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<TradeIdentification> getRelatedTradeIdentification() {
		return relatedTradeIdentification;
	}

	public void setRelatedTradeIdentification(List<com.tools20022.repository.entity.TradeIdentification> relatedTradeIdentification) {
		this.relatedTradeIdentification = relatedTradeIdentification;
	}

	public Max35Text getSideIndicator() {
		return sideIndicator;
	}

	public void setSideIndicator(Max35Text sideIndicator) {
		this.sideIndicator = sideIndicator;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}