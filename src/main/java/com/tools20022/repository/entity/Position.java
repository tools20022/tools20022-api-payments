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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
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
 * <li>{@linkplain com.tools20022.repository.entity.Position#NetQuantity
 * Position.NetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#NetPositionAmount
 * Position.NetPositionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#System
 * Position.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#Price
 * Position.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#SecuritiesSettlement
 * Position.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#InitialPositionAmount
 * Position.InitialPositionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedPosition
 * SecuritiesPricing.RelatedPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Position
 * SecuritiesQuantity.Position}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#TradesPosition
 * System.TradesPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Position
 * SecuritiesSettlement.Position}</li>
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
 * "Position"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of trades and their value inside a system."</li>
 * </ul>
 */
public class Position {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the net quantity position of the trade legs of one member
	 * within the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Position
	 * SecuritiesQuantity.Position}</li>
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
	public static final MMBusinessAssociationEnd NetQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetQuantity";
			definition = "Specifies the net quantity position of the trade legs of one member within the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Position;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute NetPositionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPositionAmount";
			definition = "Specifies the net position amount of the trade legs of one member within the system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * System for which trades position is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#TradesPosition
	 * System.TradesPosition}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which trades position is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.TradesPosition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price applied to the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedPosition
	 * SecuritiesPricing.RelatedPosition}</li>
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
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price applied to the position.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedPosition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to the settlement of the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Position
	 * SecuritiesSettlement.Position}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Information related to the settlement of the position.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Position;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute InitialPositionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Position.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialPositionAmount";
			definition = "Specifies the position at the beginning of a reporting period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Position";
				definition = "Specifies the status of trades and their value inside a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedPosition, com.tools20022.repository.entity.SecuritiesQuantity.Position,
						com.tools20022.repository.entity.System.TradesPosition, com.tools20022.repository.entity.SecuritiesSettlement.Position);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Position.NetQuantity, com.tools20022.repository.entity.Position.NetPositionAmount, com.tools20022.repository.entity.Position.System,
						com.tools20022.repository.entity.Position.Price, com.tools20022.repository.entity.Position.SecuritiesSettlement, com.tools20022.repository.entity.Position.InitialPositionAmount);
			}
		});
		return mmObject_lazy.get();
	}
}