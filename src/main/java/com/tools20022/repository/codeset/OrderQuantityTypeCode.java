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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the order is placed, eg by quantity of units or by amount of
 * money.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmUnit
 * OrderQuantityTypeCode.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmAmount
 * OrderQuantityTypeCode.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmOther
 * OrderQuantityTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmUnitsOfMeasurePerTimeUnit
 * OrderQuantityTypeCode.mmUnitsOfMeasurePerTimeUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmCancelledQuantity
 * OrderQuantityTypeCode.mmCancelledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmConfirmed
 * OrderQuantityTypeCode.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmMatchIncrement
 * OrderQuantityTypeCode.mmMatchIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmOriginalOrdered
 * OrderQuantityTypeCode.mmOriginalOrdered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmPreviouslyExecuted
 * OrderQuantityTypeCode.mmPreviouslyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmRemainingOnOrder
 * OrderQuantityTypeCode.mmRemainingOnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmReplacedQuantity
 * OrderQuantityTypeCode.mmReplacedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmRequestedToBeCancelledQuantity
 * OrderQuantityTypeCode.mmRequestedToBeCancelledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode#mmRequestedToBeReplacedQuantity
 * OrderQuantityTypeCode.mmRequestedToBeReplacedQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderQuantityTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the order is placed, eg by quantity of units or by amount of money."
 * </li>
 * </ul>
 */
public class OrderQuantityTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is placed by unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is placed by unit."</li>
	 * </ul>
	 */
	public static final MMCode mmUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Order is placed by unit.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Order is placed by amount of money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is placed by amount of money."</li>
	 * </ul>
	 */
	public static final MMCode mmAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Order is placed by amount of money.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is another type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is another type of transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Transaction is another type of transaction.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * For futures - units of Measure per Time Unit (if used - must specify
	 * UnitofMeasure and TimeUnit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UMPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsOfMeasurePerTimeUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For futures - units of Measure per Time Unit (if used - must specify UnitofMeasure and TimeUnit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnitsOfMeasurePerTimeUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsOfMeasurePerTimeUnit";
			definition = "For futures - units of Measure per Time Unit (if used - must specify UnitofMeasure and TimeUnit.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "UMPU";
		}
	};
	/**
	 * Quantity of the financial instrument effectively cancelled (for CPRC
	 * status only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the financial instrument effectively cancelled (for CPRC status only)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancelledQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledQuantity";
			definition = "Quantity of the financial instrument effectively cancelled (for CPRC status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "AFCA";
		}
	};
	/**
	 * Quantity of financial instrument confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument confirmed."</li>
	 * </ul>
	 */
	public static final MMCode mmConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Quantity of financial instrument confirmed.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Minimum quantity that applies to every execution. The order may still
	 * fill against smaller orders, but the cumulative quantity of the execution
	 * must be in multiples of the Match Increment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity that applies to every execution. The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the Match Increment. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMatchIncrement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIncrement";
			definition = "Minimum quantity that applies to every execution. The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the Match Increment. ";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Quantity of financial instrument ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrdered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument ordered."</li>
	 * </ul>
	 */
	public static final MMCode mmOriginalOrdered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrdered";
			definition = "Quantity of financial instrument ordered.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Quantity of financial instrument that has been previously executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument that has been previously executed."</li>
	 * </ul>
	 */
	public static final MMCode mmPreviouslyExecuted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyExecuted";
			definition = "Quantity of financial instrument that has been previously executed.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "PREX";
		}
	};
	/**
	 * Quantity of financial instrument that is remaining on order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingOnOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument that is remaining on order."</li>
	 * </ul>
	 */
	public static final MMCode mmRemainingOnOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingOnOrder";
			definition = "Quantity of financial instrument that is remaining on order.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REMI";
		}
	};
	/**
	 * Quantity of the financial instrument effectively replaced (For RPRC
	 * status only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the financial instrument effectively replaced (For RPRC status only)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReplacedQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacedQuantity";
			definition = "Quantity of the financial instrument effectively replaced (For RPRC status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REMA";
		}
	};
	/**
	 * Quantity of the financial instrument requested to be cancelled (for CPRC
	 * Status only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedToBeCancelledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the financial instrument requested to be cancelled (for CPRC Status only)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRequestedToBeCancelledQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedToBeCancelledQuantity";
			definition = "Quantity of the financial instrument requested to be cancelled (for CPRC Status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Quantity of the financial instrument requested to be replaced (for RPRC
	 * Status only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedToBeReplacedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the financial instrument requested to be replaced (for RPRC Status only)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRequestedToBeReplacedQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedToBeReplacedQuantity";
			definition = "Quantity of the financial instrument requested to be replaced (for RPRC Status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UNIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderQuantityTypeCode";
				definition = "Specifies how the order is placed, eg by quantity of units or by amount of money.";
				code_lazy = () -> Arrays.asList(OrderQuantityTypeCode.mmUnit, OrderQuantityTypeCode.mmAmount, OrderQuantityTypeCode.mmOther, OrderQuantityTypeCode.mmUnitsOfMeasurePerTimeUnit, OrderQuantityTypeCode.mmCancelledQuantity,
						OrderQuantityTypeCode.mmConfirmed, OrderQuantityTypeCode.mmMatchIncrement, OrderQuantityTypeCode.mmOriginalOrdered, OrderQuantityTypeCode.mmPreviouslyExecuted, OrderQuantityTypeCode.mmRemainingOnOrder,
						OrderQuantityTypeCode.mmReplacedQuantity, OrderQuantityTypeCode.mmRequestedToBeCancelledQuantity, OrderQuantityTypeCode.mmRequestedToBeReplacedQuantity);
			}
		});
		return mmObject_lazy.get();
	}
}