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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BookingTypeCode;
import com.tools20022.repository.codeset.BookingUnitCode;
import com.tools20022.repository.codeset.DayBookingInstructionCode;
import com.tools20022.repository.codeset.PreAllocationMethodCode;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Information used to book the executions of a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPostTradeBooking"
 * src="doc-files/SecuritiesPostTradeBooking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmDayBooking
 * SecuritiesPostTradeBooking.mmDayBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmBookingUnit
 * SecuritiesPostTradeBooking.mmBookingUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmPreAllocationMethod
 * SecuritiesPostTradeBooking.mmPreAllocationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmBookingType
 * SecuritiesPostTradeBooking.mmBookingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmRelatedOrder
 * SecuritiesPostTradeBooking.mmRelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
 * SecuritiesOrder.mmBookingInstructions}</li>
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
 * "SecuritiesPostTradeBooking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to book the executions of a trade."</li>
 * </ul>
 */
public class SecuritiesPostTradeBooking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DayBookingInstructionCode dayBooking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode
	 * DayBookingInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 589</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not automatic booking can occur."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDayBooking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "589"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayBooking";
			definition = "Indicates whether or not automatic booking can occur.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DayBookingInstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPostTradeBooking.class.getMethod("getDayBooking", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BookingUnitCode bookingUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode
	 * BookingUnitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 590</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates what constitutes a bookable unit, ie, a partial execution, or an aggregated execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBookingUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "590"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookingUnit";
			definition = "Indicates what constitutes a bookable unit, ie, a partial execution, or an aggregated execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookingUnitCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPostTradeBooking.class.getMethod("getBookingUnit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PreAllocationMethodCode preAllocationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreAllocationMethodCode
	 * PreAllocationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the method of preallocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreAllocationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocationMethod";
			definition = "Indicates the method of preallocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreAllocationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPostTradeBooking.class.getMethod("getPreAllocationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BookingTypeCode bookingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode
	 * BookingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method for booking out an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBookingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookingType";
			definition = "Method for booking out an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPostTradeBooking.class.getMethod("getBookingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
	 * SecuritiesOrder.mmBookingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which booking instructions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which booking instructions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmBookingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPostTradeBooking";
				definition = "Information used to book the executions of a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmBookingInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmDayBooking, com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmBookingUnit,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmPreAllocationMethod, com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmBookingType,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmRelatedOrder);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPostTradeBooking.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DayBookingInstructionCode getDayBooking() {
		return dayBooking;
	}

	public SecuritiesPostTradeBooking setDayBooking(DayBookingInstructionCode dayBooking) {
		this.dayBooking = Objects.requireNonNull(dayBooking);
		return this;
	}

	public BookingUnitCode getBookingUnit() {
		return bookingUnit;
	}

	public SecuritiesPostTradeBooking setBookingUnit(BookingUnitCode bookingUnit) {
		this.bookingUnit = Objects.requireNonNull(bookingUnit);
		return this;
	}

	public PreAllocationMethodCode getPreAllocationMethod() {
		return preAllocationMethod;
	}

	public SecuritiesPostTradeBooking setPreAllocationMethod(PreAllocationMethodCode preAllocationMethod) {
		this.preAllocationMethod = Objects.requireNonNull(preAllocationMethod);
		return this;
	}

	public BookingTypeCode getBookingType() {
		return bookingType;
	}

	public SecuritiesPostTradeBooking setBookingType(BookingTypeCode bookingType) {
		this.bookingType = Objects.requireNonNull(bookingType);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesPostTradeBooking setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}
}