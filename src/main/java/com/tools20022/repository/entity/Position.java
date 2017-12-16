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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of trades and their value inside a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Position" src="doc-files/Position.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
 * Position.mmNetQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmNetPositionAmount
 * Position.mmNetPositionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmSystem
 * Position.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmPrice
 * Position.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
 * Position.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmInitialPositionAmount
 * Position.mmInitialPositionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedPosition
 * SecuritiesPricing.mmRelatedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPosition
 * SecuritiesQuantity.mmPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTradesPosition
 * System.mmTradesPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPosition
 * SecuritiesSettlement.mmPosition}</li>
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
 * "Position"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of trades and their value inside a system."</li>
 * </ul>
 */
public class Position {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity netQuantity;
	/**
	 * Specifies the net quantity position of the trade legs of one member
	 * within the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPosition
	 * SecuritiesQuantity.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the net quantity position of the trade legs of one member within the system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetQuantity";
			definition = "Specifies the net quantity position of the trade legs of one member within the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmPosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CurrencyAndAmount netPositionAmount;
	/**
	 * Specifies the net position amount of the trade legs of one member within
	 * the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the net position amount of the trade legs of one member within the system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetPositionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPositionAmount";
			definition = "Specifies the net position amount of the trade legs of one member within the system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Position.class.getMethod("getNetPositionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected System system;
	/**
	 * System for which trades position is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmTradesPosition
	 * System.mmTradesPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which trades position is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which trades position is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmTradesPosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected SecuritiesPricing price;
	/**
	 * Price applied to the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedPosition
	 * SecuritiesPricing.mmRelatedPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price applied to the position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price applied to the position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedPosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Information related to the settlement of the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPosition
	 * SecuritiesSettlement.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the settlement of the position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Information related to the settlement of the position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected CurrencyAndAmount initialPositionAmount;
	/**
	 * Specifies the position at the beginning of a reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Position
	 * Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the position at the beginning of a reporting period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInitialPositionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialPositionAmount";
			definition = "Specifies the position at the beginning of a reporting period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Position.class.getMethod("getInitialPositionAmount", new Class[]{});
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
				name = "Position";
				definition = "Specifies the status of trades and their value inside a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedPosition, com.tools20022.repository.entity.SecuritiesQuantity.mmPosition,
						com.tools20022.repository.entity.System.mmTradesPosition, com.tools20022.repository.entity.SecuritiesSettlement.mmPosition);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Position.mmNetQuantity, com.tools20022.repository.entity.Position.mmNetPositionAmount, com.tools20022.repository.entity.Position.mmSystem,
						com.tools20022.repository.entity.Position.mmPrice, com.tools20022.repository.entity.Position.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmInitialPositionAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Position.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getNetQuantity() {
		return netQuantity;
	}

	public void setNetQuantity(com.tools20022.repository.entity.SecuritiesQuantity netQuantity) {
		this.netQuantity = netQuantity;
	}

	public CurrencyAndAmount getNetPositionAmount() {
		return netPositionAmount;
	}

	public void setNetPositionAmount(CurrencyAndAmount netPositionAmount) {
		this.netPositionAmount = netPositionAmount;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.SecuritiesPricing price) {
		this.price = price;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public CurrencyAndAmount getInitialPositionAmount() {
		return initialPositionAmount;
	}

	public void setInitialPositionAmount(CurrencyAndAmount initialPositionAmount) {
		this.initialPositionAmount = initialPositionAmount;
	}
}