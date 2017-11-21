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
 * A set of international standard trade terms (delivery terms) used to
 * designate a point at which the costs and risks of transport are divided
 * between the buyer and the seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IncotermsCode#mmExWorks
 * IncotermsCode.mmExWorks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmFreeCarrier
 * IncotermsCode.mmFreeCarrier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmFreeAlongsideShip
 * IncotermsCode.mmFreeAlongsideShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmFreeOnBoard
 * IncotermsCode.mmFreeOnBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmCostAndFreight
 * IncotermsCode.mmCostAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmCostInsuranceAndFreight
 * IncotermsCode.mmCostInsuranceAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmCarriagePaid
 * IncotermsCode.mmCarriagePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmCarriageAndInsurancePaid
 * IncotermsCode.mmCarriageAndInsurancePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmDeliveredAtFrontier
 * IncotermsCode.mmDeliveredAtFrontier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmDeliveredExShip
 * IncotermsCode.mmDeliveredExShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmDeliveredExQuay
 * IncotermsCode.mmDeliveredExQuay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmDeliveredDutyUnpaid
 * IncotermsCode.mmDeliveredDutyUnpaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#mmDeliveredDutyPaid
 * IncotermsCode.mmDeliveredDutyPaid}</li>
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
 * <li>"EXW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IncotermsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller."
 * </li>
 * </ul>
 */
public class IncotermsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ex Works (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWorks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ex Works (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmExWorks = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExWorks";
			definition = "Ex Works (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "EXW";
		}
	};
	/**
	 * Free Carrier (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCarrier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free Carrier (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeCarrier = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeCarrier";
			definition = "Free Carrier (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FCA";
		}
	};
	/**
	 * Free Alongside Ship (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeAlongsideShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free Alongside Ship (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeAlongsideShip = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeAlongsideShip";
			definition = "Free Alongside Ship (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FAS";
		}
	};
	/**
	 * Free On Board (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeOnBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free On Board (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeOnBoard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeOnBoard";
			definition = "Free On Board (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FOB";
		}
	};
	/**
	 * Cost and Freight (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAndFreight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost and Freight (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmCostAndFreight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostAndFreight";
			definition = "Cost and Freight (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CFR";
		}
	};
	/**
	 * Cost, Insurance and Freight (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostInsuranceAndFreight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cost, Insurance and Freight (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmCostInsuranceAndFreight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostInsuranceAndFreight";
			definition = "Cost, Insurance and Freight (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CIF";
		}
	};
	/**
	 * Carriage Paid To (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriagePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Carriage Paid To (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmCarriagePaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarriagePaid";
			definition = "Carriage Paid To (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CPT";
		}
	};
	/**
	 * Carriage and Insurance Paid to (any mode of transport, including
	 * multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriageAndInsurancePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Carriage and Insurance Paid to (any mode of transport, including multimodal)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCarriageAndInsurancePaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarriageAndInsurancePaid";
			definition = "Carriage and Insurance Paid to (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CIP";
		}
	};
	/**
	 * Delivered At Frontier (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredAtFrontier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered At Frontier (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredAtFrontier = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredAtFrontier";
			definition = "Delivered At Frontier (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DAF";
		}
	};
	/**
	 * Delivered Ex Ship (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivered Ex Ship (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredExShip = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredExShip";
			definition = "Delivered Ex Ship (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DES";
		}
	};
	/**
	 * Delivered Ex Quay (sea and inland waterway transport)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExQuay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivered Ex Quay (sea and inland waterway transport)"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredExQuay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredExQuay";
			definition = "Delivered Ex Quay (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DEQ";
		}
	};
	/**
	 * Delivered Duty Unpaid (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyUnpaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered Duty Unpaid (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredDutyUnpaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyUnpaid";
			definition = "Delivered Duty Unpaid (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DDU";
		}
	};
	/**
	 * Delivered Duty Paid (any mode of transport, including multimodal)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered Duty Paid (any mode of transport, including multimodal)"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredDutyPaid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyPaid";
			definition = "Delivered Duty Paid (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DDP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EXW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncotermsCode";
				definition = "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller.";
				code_lazy = () -> Arrays.asList(IncotermsCode.mmExWorks, IncotermsCode.mmFreeCarrier, IncotermsCode.mmFreeAlongsideShip, IncotermsCode.mmFreeOnBoard, IncotermsCode.mmCostAndFreight, IncotermsCode.mmCostInsuranceAndFreight,
						IncotermsCode.mmCarriagePaid, IncotermsCode.mmCarriageAndInsurancePaid, IncotermsCode.mmDeliveredAtFrontier, IncotermsCode.mmDeliveredExShip, IncotermsCode.mmDeliveredExQuay, IncotermsCode.mmDeliveredDutyUnpaid,
						IncotermsCode.mmDeliveredDutyPaid);
			}
		});
		return mmObject_lazy.get();
	}
}