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
import com.tools20022.repository.codeset.MoveTypeCode;
import com.tools20022.repository.codeset.OffsetTypeCode;
import com.tools20022.repository.codeset.PegTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffset
 * SecuritiesPegOrderInstruction.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmPriceType
 * SecuritiesPegOrderInstruction.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmMoveType
 * SecuritiesPegOrderInstruction.mmMoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetType
 * SecuritiesPegOrderInstruction.mmOffsetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmLimitType
 * SecuritiesPegOrderInstruction.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmScope
 * SecuritiesPegOrderInstruction.mmScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetSign
 * SecuritiesPegOrderInstruction.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOrder
 * SecuritiesPegOrderInstruction.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRelatedPegOrderInstruction
 * RoundingParameters.mmRelatedPegOrderInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPegInstructions
 * SecuritiesOrderParameters.mmPegInstructions}</li>
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
 * "SecuritiesPegOrderInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instructions specific to pegged orders, which consist in an investor buying large amounts of  the underlying asset of a derivative it holds.\r\n"
 * </li>
 * </ul>
 */
public class SecuritiesPegOrderInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount offset;
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
	public static final MMBusinessAttribute mmOffset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount (signed) added to the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getOffset", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PegTypeCode priceType;
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
	public static final MMBusinessAttribute mmPriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Defines the type of peg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PegTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getPriceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MoveTypeCode moveType;
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
	public static final MMBusinessAttribute mmMoveType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether peg is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getMoveType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OffsetTypeCode offsetType;
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
	public static final MMBusinessAttribute mmOffsetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Type of peg offset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getOffsetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text limitType;
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
	public static final MMBusinessAttribute mmLimitType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies nature of resulting pegged price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getLimitType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriceProtectionScopeCode scope;
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
	public static final MMBusinessAttribute mmScope = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the peg (for example, local, global etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getScope", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PlusOrMinusIndicator offsetSign;
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
	public static final MMBusinessAttribute mmOffsetSign = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added to or subtracted from the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPegOrderInstruction.class.getMethod("getOffsetSign", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrderParameters order;
	/**
	 * Order which is pegged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPegInstructions
	 * SecuritiesOrderParameters.mmPegInstructions}</li>
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is pegged.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmPegInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected RoundingParameters roundDirection;
	/**
	 * If the calculated peg price is not a valid tick price, specifies how to
	 * round the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRelatedPegOrderInstruction
	 * RoundingParameters.mmRelatedPegOrderInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmRoundDirection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated peg price is not a valid tick price, specifies how to round the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmRelatedPegOrderInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPegOrderInstruction";
				definition = "Instructions specific to pegged orders, which consist in an investor buying large amounts of  the underlying asset of a derivative it holds.\r\n";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.mmRelatedPegOrderInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPegInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOffset, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmPriceType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmMoveType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOffsetType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmLimitType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmScope,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOffsetSign, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmOrder,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmRoundDirection);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPegOrderInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getOffset() {
		return offset;
	}

	public void setOffset(CurrencyAndAmount offset) {
		this.offset = offset;
	}

	public PegTypeCode getPriceType() {
		return priceType;
	}

	public void setPriceType(PegTypeCode priceType) {
		this.priceType = priceType;
	}

	public MoveTypeCode getMoveType() {
		return moveType;
	}

	public void setMoveType(MoveTypeCode moveType) {
		this.moveType = moveType;
	}

	public OffsetTypeCode getOffsetType() {
		return offsetType;
	}

	public void setOffsetType(OffsetTypeCode offsetType) {
		this.offsetType = offsetType;
	}

	public Max35Text getLimitType() {
		return limitType;
	}

	public void setLimitType(Max35Text limitType) {
		this.limitType = limitType;
	}

	public PriceProtectionScopeCode getScope() {
		return scope;
	}

	public void setScope(PriceProtectionScopeCode scope) {
		this.scope = scope;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return offsetSign;
	}

	public void setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = offsetSign;
	}

	public SecuritiesOrderParameters getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.SecuritiesOrderParameters order) {
		this.order = order;
	}

	public RoundingParameters getRoundDirection() {
		return roundDirection;
	}

	public void setRoundDirection(com.tools20022.repository.entity.RoundingParameters roundDirection) {
		this.roundDirection = roundDirection;
	}
}