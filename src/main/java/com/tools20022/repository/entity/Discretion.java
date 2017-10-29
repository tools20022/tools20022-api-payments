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
import com.tools20022.repository.codeset.MoveTypeCode;
import com.tools20022.repository.codeset.OffsetTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.codeset.TypeOfDiscretionPriceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discretion" src="doc-files/Discretion.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#RelatedOrderExecution
 * Discretion.RelatedOrderExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#Offset
 * Discretion.Offset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#OffsetSign
 * Discretion.OffsetSign}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#RelatedPriceType
 * Discretion.RelatedPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#MoveType
 * Discretion.MoveType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#LimitType
 * Discretion.LimitType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#RoundDirection
 * Discretion.RoundDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#Scope
 * Discretion.Scope}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#OffsetType
 * Discretion.OffsetType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#OrderPriceStrategy
 * SecuritiesOrderExecutionInstruction.OrderPriceStrategy}</li>
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
 * "Discretion"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price."
 * </li>
 * </ul>
 */
public class Discretion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order instruction for which a discretion is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#OrderPriceStrategy
	 * SecuritiesOrderExecutionInstruction.OrderPriceStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order instruction for which a discretion is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order instruction for which a discretion is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount added to the 'related to' price.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount added to the 'related to' price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Offset = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount added to the 'related to' price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the offset should be added or subtracted from the
	 * related price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added or subtracted from the related price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffsetSign = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Identify the type of price an offset is related to. The offset can either
	 * be added or subtracted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the type of price an offset is related to. The offset can either be added or subtracted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedPriceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
		}
	};
	/**
	 * Describes whether discretion price is static/fixed or floats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.MoveTypeCode
	 * MoveTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes whether discretion price is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MoveType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the nature of the resulting discretion price (e.g. or better
	 * limit, strict limit etc).
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
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LimitType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * If the calculated discretion price is not a valid tick price, specifies
	 * how to round the price (e.g. to be more or less aggressive)
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
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RoundDirection = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * The scope of "related to" price of the discretion (e.g. local, global
	 * etc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the discretion (e.g. local, global etc)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Scope = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}
	};
	/**
	 * Describes the type of Discretion Offset .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of Discretion Offset ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffsetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Discretion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Discretion";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discretion.RelatedOrderExecution, com.tools20022.repository.entity.Discretion.Offset, com.tools20022.repository.entity.Discretion.OffsetSign,
						com.tools20022.repository.entity.Discretion.RelatedPriceType, com.tools20022.repository.entity.Discretion.MoveType, com.tools20022.repository.entity.Discretion.LimitType,
						com.tools20022.repository.entity.Discretion.RoundDirection, com.tools20022.repository.entity.Discretion.Scope, com.tools20022.repository.entity.Discretion.OffsetType);
			}
		});
		return mmObject_lazy.get();
	}
}