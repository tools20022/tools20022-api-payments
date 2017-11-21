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
 * Location category code of the place where the merchant actually performed the
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmFixed
 * LocationCategoryCode.mmFixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmAboard
 * LocationCategoryCode.mmAboard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmNomadic
 * LocationCategoryCode.mmNomadic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmMailOrderTelephoneOrder
 * LocationCategoryCode.mmMailOrderTelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmHome
 * LocationCategoryCode.mmHome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmIndoor
 * LocationCategoryCode.mmIndoor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmInsidePump
 * LocationCategoryCode.mmInsidePump}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmMultiplePump
 * LocationCategoryCode.mmMultiplePump}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmMultiplePOITerminal
 * LocationCategoryCode.mmMultiplePOITerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmMultipleSaleTerminal
 * LocationCategoryCode.mmMultipleSaleTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmSingleSaleTerminal
 * LocationCategoryCode.mmSingleSaleTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode#mmVendingMachine
 * LocationCategoryCode.mmVendingMachine}</li>
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
 * <li>"FIXD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LocationCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location category code of the place where the merchant actually performed the transaction."
 * </li>
 * </ul>
 */
public class LocationCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fixed location, for example in a shop.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed location, for example in a shop."</li>
	 * </ul>
	 */
	public static final MMCode mmFixed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fixed";
			definition = "Fixed location, for example in a shop.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * Aboard a bus, train, ship, airplane, taxi, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aboard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Aboard a bus, train, ship, airplane, taxi, etc."</li>
	 * </ul>
	 */
	public static final MMCode mmAboard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Aboard";
			definition = "Aboard a bus, train, ship, airplane, taxi, etc.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "ABRD";
		}
	};
	/**
	 * Nomadic location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nomadic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nomadic location."</li>
	 * </ul>
	 */
	public static final MMCode mmNomadic = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Nomadic";
			definition = "Nomadic location.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "NMDC";
		}
	};
	/**
	 * Mail order or telephone order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrderTelephoneOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mail order or telephone order."</li>
	 * </ul>
	 */
	public static final MMCode mmMailOrderTelephoneOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailOrderTelephoneOrder";
			definition = "Mail order or telephone order.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MOTO";
		}
	};
	/**
	 * Customer home.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Home"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer home."</li>
	 * </ul>
	 */
	public static final MMCode mmHome = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Home";
			definition = "Customer home.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "HOME";
		}
	};
	/**
	 * Indoor terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indoor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indoor terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmIndoor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indoor";
			definition = "Indoor terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "INDR";
		}
	};
	/**
	 * Terminal incorporated in the pump dispensing petrol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsidePump"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal incorporated in the pump dispensing petrol."</li>
	 * </ul>
	 */
	public static final MMCode mmInsidePump = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsidePump";
			definition = "Terminal incorporated in the pump dispensing petrol.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "IPMP";
		}
	};
	/**
	 * Outdoor terminal serving several petrol pumps.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplePump"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outdoor terminal serving several petrol pumps."</li>
	 * </ul>
	 */
	public static final MMCode mmMultiplePump = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePump";
			definition = "Outdoor terminal serving several petrol pumps.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MPMP";
		}
	};
	/**
	 * Multiple terminals linked to a unique sale terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPOI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplePOITerminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiple terminals linked to a unique sale terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmMultiplePOITerminal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePOITerminal";
			definition = "Multiple terminals linked to a unique sale terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MPOI";
		}
	};
	/**
	 * Terminal serving multiple sale terminals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSaleTerminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal serving multiple sale terminals."</li>
	 * </ul>
	 */
	public static final MMCode mmMultipleSaleTerminal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSaleTerminal";
			definition = "Terminal serving multiple sale terminals.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MSLE";
		}
	};
	/**
	 * Terminal linked to a unique sale terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSaleTerminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal linked to a unique sale terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmSingleSaleTerminal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSaleTerminal";
			definition = "Terminal linked to a unique sale terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "SSLE";
		}
	};
	/**
	 * Terminal integrated in a vending machine.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VNDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendingMachine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal integrated in a vending machine."</li>
	 * </ul>
	 */
	public static final MMCode mmVendingMachine = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendingMachine";
			definition = "Terminal integrated in a vending machine.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "VNDG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIXD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocationCategoryCode";
				definition = "Location category code of the place where the merchant actually performed the transaction.";
				code_lazy = () -> Arrays.asList(LocationCategoryCode.mmFixed, LocationCategoryCode.mmAboard, LocationCategoryCode.mmNomadic, LocationCategoryCode.mmMailOrderTelephoneOrder, LocationCategoryCode.mmHome,
						LocationCategoryCode.mmIndoor, LocationCategoryCode.mmInsidePump, LocationCategoryCode.mmMultiplePump, LocationCategoryCode.mmMultiplePOITerminal, LocationCategoryCode.mmMultipleSaleTerminal,
						LocationCategoryCode.mmSingleSaleTerminal, LocationCategoryCode.mmVendingMachine);
			}
		});
		return mmObject_lazy.get();
	}
}