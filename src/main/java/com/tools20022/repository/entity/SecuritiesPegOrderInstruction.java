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
import com.tools20022.repository.codeset.PegTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instructions specific to pegged orders, which consist in an investor buying
 * large amounts of the underlying asset of a derivative it holds.<br>
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPegOrderInstruction"
 * src="doc-files/SecuritiesPegOrderInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#Offset
 * SecuritiesPegOrderInstruction.Offset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#PriceType
 * SecuritiesPegOrderInstruction.PriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#MoveType
 * SecuritiesPegOrderInstruction.MoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#OffsetType
 * SecuritiesPegOrderInstruction.OffsetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#LimitType
 * SecuritiesPegOrderInstruction.LimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#Scope
 * SecuritiesPegOrderInstruction.Scope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#OffsetSign
 * SecuritiesPegOrderInstruction.OffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#Order
 * SecuritiesPegOrderInstruction.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#RoundDirection
 * SecuritiesPegOrderInstruction.RoundDirection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#RelatedPegOrderInstruction
 * RoundingParameters.RelatedPegOrderInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PegInstructions
 * SecuritiesOrderParameters.PegInstructions}</li>
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
 * "SecuritiesPegOrderInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instructions specific to pegged orders, which consist in an investor buying large amounts of  the underlying asset of a derivative it holds.\r\n"
 * </li>
 * </ul>
 */
public class SecuritiesPegOrderInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount (signed) added to the peg for a pegged order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount (signed) added to the peg for a pegged order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Offset = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount (signed) added to the peg for a pegged order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Defines the type of peg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PegTypeCode
	 * PegTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of peg."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Defines the type of peg.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PegTypeCode.mmObject();
		}
	};
	/**
	 * Describes whether peg is static/fixed or floats.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes whether peg is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MoveType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether peg is static/fixed or floats.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}
	};
	/**
	 * Type of peg offset.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of peg offset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffsetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Type of peg offset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}
	};
	/**
	 * Specifies nature of resulting pegged price.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies nature of resulting pegged price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LimitType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies nature of resulting pegged price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * The scope of "related to" price of the peg (for example, local, global
	 * etc).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the peg (for example, local, global etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Scope = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the peg (for example, local, global etc).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the offset should be added to or subtracted from the
	 * peg for a pegged order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added to or subtracted from the peg for a pegged order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffsetSign = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added to or subtracted from the peg for a pegged order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Order which is pegged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PegInstructions
	 * SecuritiesOrderParameters.PegInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is pegged."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is pegged.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * If the calculated peg price is not a valid tick price, specifies how to
	 * round the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#RelatedPegOrderInstruction
	 * RoundingParameters.RelatedPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated peg price is not a valid tick price, specifies how to round the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundDirection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated peg price is not a valid tick price, specifies how to round the price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RoundingParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPegOrderInstruction";
				definition = "Instructions specific to pegged orders, which consist in an investor buying large amounts of  the underlying asset of a derivative it holds.\r\n";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Offset, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.PriceType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.MoveType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.OffsetType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.LimitType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Scope,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.OffsetSign, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection);
			}
		});
		return mmObject_lazy.get();
	}
}